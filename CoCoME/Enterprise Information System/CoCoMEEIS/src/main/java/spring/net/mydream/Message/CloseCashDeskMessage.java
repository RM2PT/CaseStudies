package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CloseCashDeskMessage{
	public int cashDeskID;
	public int getCashDeskID() {
		return cashDeskID;
	}
					
	public void setCashDeskID(int cashDeskID) {
		this.cashDeskID = cashDeskID;
	}
}
