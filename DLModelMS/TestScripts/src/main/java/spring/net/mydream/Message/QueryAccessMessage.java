package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class QueryAccessMessage{
	public String symbol;
	public String getSymbol() {
		return symbol;
	}
					
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
