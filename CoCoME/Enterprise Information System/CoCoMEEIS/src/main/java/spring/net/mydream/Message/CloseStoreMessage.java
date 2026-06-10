package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CloseStoreMessage{
	public int storeID;
	public int getStoreID() {
		return storeID;
	}
					
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
}
