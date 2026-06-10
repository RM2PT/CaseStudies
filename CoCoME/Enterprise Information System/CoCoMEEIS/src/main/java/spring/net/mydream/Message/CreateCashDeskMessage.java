package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateCashDeskMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public Boolean isopened;
	public Boolean getIsopened() {
		return isopened;
	}
					
	public void setIsopened(Boolean isopened) {
		this.isopened = isopened;
	}
}
