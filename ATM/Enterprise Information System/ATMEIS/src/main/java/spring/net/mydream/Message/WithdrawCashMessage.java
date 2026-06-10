package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class WithdrawCashMessage{
	public int quantity;
	public int getQuantity() {
		return quantity;
	}
					
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
