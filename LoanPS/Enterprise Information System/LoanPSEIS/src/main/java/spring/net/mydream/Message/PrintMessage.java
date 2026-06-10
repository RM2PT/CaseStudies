package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class PrintMessage{
	public String content;
	public String getContent() {
		return content;
	}
					
	public void setContent(String content) {
		this.content = content;
	}
	public int numbers;
	public int getNumbers() {
		return numbers;
	}
					
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
}
