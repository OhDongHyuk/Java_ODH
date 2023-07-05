package quiz.test13.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Book2 implements Serializable {
	
	private static final long serialVersionUID = 1792665776232677584L;
	private String bookName;
	private String bookWriter;
	private String bookIsbn;
	private String bookNum;
	private boolean loan;
	@Override
	public String toString() {
		return "도서번호 : " + bookNum + "\n" +
				"도서제목 : " + bookName + "\n" +
				"도서저자 : " + bookWriter + "\n" +
				"ISBN : " + bookIsbn;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book2 other = (Book2) obj;
		return Objects.equals(bookNum, other.bookNum);
	}
	
	public void loanBook() {
		this.loan = true; //setLoan(true);
	}
	public void returnBook() {
		this.loan = false;//setLoan(false);
	}
	
	public Book2(String bookName, String bookWriter, String bookIsbn, String bookNum) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookIsbn = bookIsbn;
		this.bookNum = bookNum;
	}
	
	
}
