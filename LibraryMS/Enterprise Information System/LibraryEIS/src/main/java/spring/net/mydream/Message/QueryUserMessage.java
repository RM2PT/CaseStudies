package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class QueryUserMessage{
	public String userid;
	public String getUserid() {
		return userid;
	}
					
	public void setUserid(String userid) {
		this.userid = userid;
	}
}
