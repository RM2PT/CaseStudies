package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class AddCommentReplyMessage{
	public String cmname;
	public String getCmname() {
		return cmname;
	}
					
	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public String content;
	public String getContent() {
		return content;
	}
					
	public void setContent(String content) {
		this.content = content;
	}
}
