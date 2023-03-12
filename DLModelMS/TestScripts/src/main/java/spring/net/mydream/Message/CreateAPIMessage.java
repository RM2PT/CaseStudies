package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateAPIMessage{
	public String token;
	public String getToken() {
		return token;
	}
					
	public void setToken(String token) {
		this.token = token;
	}
}
