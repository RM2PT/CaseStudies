package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class QueryBankCardMessage{
	public int cardid;
	public int getCardid() {
		return cardid;
	}
					
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
}
