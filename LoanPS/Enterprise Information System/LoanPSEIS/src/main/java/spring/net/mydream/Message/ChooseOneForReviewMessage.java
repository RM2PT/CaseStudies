package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ChooseOneForReviewMessage{
	public int requestid;
	public int getRequestid() {
		return requestid;
	}
					
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
}
