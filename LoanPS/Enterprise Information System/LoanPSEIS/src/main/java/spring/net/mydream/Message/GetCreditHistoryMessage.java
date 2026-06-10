package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetCreditHistoryMessage{
	public int securityid;
	public int getSecurityid() {
		return securityid;
	}
					
	public void setSecurityid(int securityid) {
		this.securityid = securityid;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
}
