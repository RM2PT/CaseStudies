package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DeleteBookMessage{
	public String callno;
	public String getCallno() {
		return callno;
	}
					
	public void setCallno(String callno) {
		this.callno = callno;
	}
}
