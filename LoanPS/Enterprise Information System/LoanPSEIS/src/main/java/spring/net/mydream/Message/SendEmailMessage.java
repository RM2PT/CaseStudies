package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SendEmailMessage{
	public String emailaddress;
	public String getEmailaddress() {
		return emailaddress;
	}
					
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String title;
	public String getTitle() {
		return title;
	}
					
	public void setTitle(String title) {
		this.title = title;
	}
	public String content;
	public String getContent() {
		return content;
	}
					
	public void setContent(String content) {
		this.content = content;
	}
}
