package quiz.test13.vo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

@Data
public class BookRentalList implements Serializable{
	 
	private static final long serialVersionUID = -4679059512832750454L;
	private String title, author, num, isbn;
	private Date rentalDay, returnDay;
	public BookRentalList(String title, String author, String num, String isbn, Date rentalDay, Date returnDay) {
		super();
		this.title = title;
		this.author = author;
		this.num = num;
		this.isbn = isbn;
		this.rentalDay = rentalDay;
		this.returnDay = returnDay;
	}
	
	public BookRentalList(String bookName, String bookWriter, String bookIsbn, String bookNum, Object rentalDay2,
			Object returnDay2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "도서번호 : " + num + "\n" +
				"도서제목 : " + title + "\n" +
				"도서저자 : " + author + "\n" +
				"ISBN : " + isbn + "\n" + 
				"대출일자 : " + rentalDay + "\n" +
				"반납예정일 : " + returnDay;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookRentalList other = (BookRentalList) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(num, other.num) && Objects.equals(rentalDay, other.rentalDay)
				&& Objects.equals(returnDay, other.returnDay) && Objects.equals(title, other.title);
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, num, rentalDay, returnDay, title);
	}
	
	private int rentalDay(Date rentalDay) {
		if(rentalDay == null) {
			return -1;
		}
		
		Calendar cal = Calendar.getInstance();//현재 시간을 달력으로 변환
				
		//현재 시간에 대한 년, 월, 일을 가져옴
		int year = cal.get(Calendar.YEAR), month = cal.get(Calendar.MONTH), day = cal.get(Calendar.DAY_OF_MONTH);
		
		return year;
	}
	
	
	
}
