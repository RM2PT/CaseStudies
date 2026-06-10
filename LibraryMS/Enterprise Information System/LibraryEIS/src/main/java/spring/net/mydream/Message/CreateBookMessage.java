package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateBookMessage{
	public String callno;
	public String getCallno() {
		return callno;
	}
					
	public void setCallno(String callno) {
		this.callno = callno;
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
	public int copynum;
	public int getCopynum() {
		return copynum;
	}
					
	public void setCopynum(int copynum) {
		this.copynum = copynum;
	}
}
