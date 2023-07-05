package quiz.test13.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class BookRentalList implements Serializable{
	 
	private static final long serialVersionUID = -4679059512832750454L;
	private Book2 book;
	private Date rentalDay, returnDay;
	
	public BookRentalList(Book2 book, Date date, int loanPeriod) {
		this.book = book;
		this.rentalDay = date;
	}
	
	public String getLoanDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(rentalDay);
	}
	
	
	
	
	
}
