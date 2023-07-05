package quiz.test13.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1792665776232677584L;
	private String bookName;
	private String bookWriter;
	private String bookIsbn;
	private String bookNum;
	@Override
	public String toString() {
		return "도서번호 : " + bookNum + "\n" +
				"도서제목 : " + bookName + "\n" +
				"도서저자 : " + bookWriter + "\n" +
				"ISBN : " + bookIsbn;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookIsbn, other.bookIsbn) && Objects.equals(bookName, other.bookName)
				&& Objects.equals(bookNum, other.bookNum) && Objects.equals(bookWriter, other.bookWriter);
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookIsbn, bookName, bookNum, bookWriter);
	}
	public Book(String bookName, String bookWriter, String bookIsbn, String bookNum) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookIsbn = bookIsbn;
		this.bookNum = bookNum;
	}
	
	
}
