package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class AddGroupMessage{
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String creator;
	public String getCreator() {
		return creator;
	}
					
	public void setCreator(String creator) {
		this.creator = creator;
	}
}
