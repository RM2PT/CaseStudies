package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateLibrarianMessage{
	public String librarianid;
	public String getLibrarianid() {
		return librarianid;
	}
					
	public void setLibrarianid(String librarianid) {
		this.librarianid = librarianid;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String password;
	public String getPassword() {
		return password;
	}
					
	public void setPassword(String password) {
		this.password = password;
	}
}
