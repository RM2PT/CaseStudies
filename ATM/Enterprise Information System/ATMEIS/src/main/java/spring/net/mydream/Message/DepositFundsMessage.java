package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DepositFundsMessage{
	public double quantity;
	public double getQuantity() {
		return quantity;
	}
					
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
}
