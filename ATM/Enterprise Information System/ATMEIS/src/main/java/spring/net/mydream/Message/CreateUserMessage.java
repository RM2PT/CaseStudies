package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateUserMessage{
	public int userid;
	public int getUserid() {
		return userid;
	}
					
	public void setUserid(int userid) {
		this.userid = userid;
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
}
