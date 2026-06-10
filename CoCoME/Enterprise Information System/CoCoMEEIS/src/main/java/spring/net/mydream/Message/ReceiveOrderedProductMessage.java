package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ReceiveOrderedProductMessage{
	public int orderID;
	public int getOrderID() {
		return orderID;
	}
					
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
}
