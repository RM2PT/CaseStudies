package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ListHodingBookMessage{
	public String uid;
	public String getUid() {
		return uid;
	}
					
	public void setUid(String uid) {
		this.uid = uid;
	}
}
