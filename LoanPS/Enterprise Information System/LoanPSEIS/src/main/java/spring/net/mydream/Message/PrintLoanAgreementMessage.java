package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class PrintLoanAgreementMessage{
	public int number;
	public int getNumber() {
		return number;
	}
					
	public void setNumber(int number) {
		this.number = number;
	}
}
