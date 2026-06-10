package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class TransferFundsMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
	public double amount;
	public double getAmount() {
		return amount;
	}
					
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
