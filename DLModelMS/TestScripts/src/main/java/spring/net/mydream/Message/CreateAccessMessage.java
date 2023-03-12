package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateAccessMessage{
	public String symbol;
	public String getSymbol() {
		return symbol;
	}
					
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int maxNum;
	public int getMaxNum() {
		return maxNum;
	}
					
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
}
