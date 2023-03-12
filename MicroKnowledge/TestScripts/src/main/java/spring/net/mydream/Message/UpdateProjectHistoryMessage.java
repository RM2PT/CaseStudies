package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class UpdateProjectHistoryMessage{
	public String title;
	public String getTitle() {
		return title;
	}
					
	public void setTitle(String title) {
		this.title = title;
	}
}
