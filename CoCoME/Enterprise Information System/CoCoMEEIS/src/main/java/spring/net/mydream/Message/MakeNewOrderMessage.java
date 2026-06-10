package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class MakeNewOrderMessage{
	public int orderid;
	public int getOrderid() {
		return orderid;
	}
					
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
}
