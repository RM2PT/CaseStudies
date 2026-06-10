package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class BookNewLoanMessage{
	public int requestid;
	public int getRequestid() {
		return requestid;
	}
					
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public int loanid;
	public int getLoanid() {
		return loanid;
	}
					
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public int accountid;
	public int getAccountid() {
		return accountid;
	}
					
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	@JsonbDateFormat("yyyy-MM-dd")
	public Date startdate;
	public Date getStartdate() {
		return startdate;
	}
					
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	@JsonbDateFormat("yyyy-MM-dd")
	public Date enddate;
	public Date getEnddate() {
		return enddate;
	}
					
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public int repaymentdays;
	public int getRepaymentdays() {
		return repaymentdays;
	}
					
	public void setRepaymentdays(int repaymentdays) {
		this.repaymentdays = repaymentdays;
	}
}
