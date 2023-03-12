package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class LabelCommentMessage{
	public String cmname;
	public String getCmname() {
		return cmname;
	}
					
	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public String teamname;
	public String getTeamname() {
		return teamname;
	}
					
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
}
