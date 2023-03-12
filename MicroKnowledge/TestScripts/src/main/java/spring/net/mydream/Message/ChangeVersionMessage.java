package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ChangeVersionMessage{
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String version;
	public String getVersion() {
		return version;
	}
					
	public void setVersion(String version) {
		this.version = version;
	}
}
