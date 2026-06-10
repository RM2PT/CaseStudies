package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateBankCardMessage{
	public int cardid;
	public int getCardid() {
		return cardid;
	}
					
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public Integer cardstatus;
	public Integer getCardstatus() {
		return cardstatus;
	}
					
	public void setCardstatus(Integer cardstatus) {
		this.cardstatus = cardstatus;
	}
	public Integer catalog;
	public Integer getCatalog() {
		return catalog;
	}
					
	public void setCatalog(Integer catalog) {
		this.catalog = catalog;
	}
	public int password;
	public int getPassword() {
		return password;
	}
					
	public void setPassword(int password) {
		this.password = password;
	}
	public double balance;
	public double getBalance() {
		return balance;
	}
					
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
