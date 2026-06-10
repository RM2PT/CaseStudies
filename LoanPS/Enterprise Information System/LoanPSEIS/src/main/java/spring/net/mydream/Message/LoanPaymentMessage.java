package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class LoanPaymentMessage{
	public int loanid;
	public int getLoanid() {
		return loanid;
	}
					
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
}
