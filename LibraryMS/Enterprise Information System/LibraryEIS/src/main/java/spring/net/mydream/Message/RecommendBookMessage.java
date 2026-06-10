package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class RecommendBookMessage{
	public String uid;
	public String getUid() {
		return uid;
	}
					
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String callNo;
	public String getCallNo() {
		return callNo;
	}
					
	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}
	public String title;
	public String getTitle() {
		return title;
	}
					
	public void setTitle(String title) {
		this.title = title;
	}
	public String edition;
	public String getEdition() {
		return edition;
	}
					
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String author;
	public String getAuthor() {
		return author;
	}
					
	public void setAuthor(String author) {
		this.author = author;
	}
	public String publisher;
	public String getPublisher() {
		return publisher;
	}
					
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String description;
	public String getDescription() {
		return description;
	}
					
	public void setDescription(String description) {
		this.description = description;
	}
	public String isbn;
	public String getIsbn() {
		return isbn;
	}
					
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
