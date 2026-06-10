package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class InputPasswordMessage{
	public int password;
	public int getPassword() {
		return password;
	}
					
	public void setPassword(int password) {
		this.password = password;
	}
}
