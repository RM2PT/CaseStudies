package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class LabelMKMessage{
	public String mkname;
	public String getMkname() {
		return mkname;
	}
					
	public void setMkname(String mkname) {
		this.mkname = mkname;
	}
	public String teamname;
	public String getTeamname() {
		return teamname;
	}
					
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
}
