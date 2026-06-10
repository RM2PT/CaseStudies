package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ModifyLoanTermMessage{
	public int itemid;
	public int getItemid() {
		return itemid;
	}
					
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String content;
	public String getContent() {
		return content;
	}
					
	public void setContent(String content) {
		this.content = content;
	}
}
