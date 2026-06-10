package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SendNotificationEmailMessage{
	public String email;
	public String getEmail() {
		return email;
	}
					
	public void setEmail(String email) {
		this.email = email;
	}
}
