package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateStoreMessage{
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
	public String address;
	public String getAddress() {
		return address;
	}
					
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean isopened;
	public Boolean getIsopened() {
		return isopened;
	}
					
	public void setIsopened(Boolean isopened) {
		this.isopened = isopened;
	}
}
