package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class AddLoanTermMessage{
	public int termid;
	public int getTermid() {
		return termid;
	}
					
	public void setTermid(int termid) {
		this.termid = termid;
	}
}
