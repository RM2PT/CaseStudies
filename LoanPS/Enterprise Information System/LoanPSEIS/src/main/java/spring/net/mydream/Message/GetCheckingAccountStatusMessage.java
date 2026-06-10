package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetCheckingAccountStatusMessage{
	public int cid;
	public int getCid() {
		return cid;
	}
					
	public void setCid(int cid) {
		this.cid = cid;
	}
}
