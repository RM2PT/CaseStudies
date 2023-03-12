package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class QueryOnlineModelMessage{
	public int onlineModelId;
	public int getOnlineModelId() {
		return onlineModelId;
	}
					
	public void setOnlineModelId(int onlineModelId) {
		this.onlineModelId = onlineModelId;
	}
}
