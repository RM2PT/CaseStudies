package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DeleteUserMessage{
	public int userid;
	public int getUserid() {
		return userid;
	}
					
	public void setUserid(int userid) {
		this.userid = userid;
	}
}
