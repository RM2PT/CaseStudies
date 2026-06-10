package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ThirdPartyCardPaymentServiceMessage{
	public String cardAccountNumber;
	public String getCardAccountNumber() {
		return cardAccountNumber;
	}
					
	public void setCardAccountNumber(String cardAccountNumber) {
		this.cardAccountNumber = cardAccountNumber;
	}
	@JsonbDateFormat("yyyy-MM-dd")
	public Date expiryDate;
	public Date getExpiryDate() {
		return expiryDate;
	}
					
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double fee;
	public double getFee() {
		return fee;
	}
					
	public void setFee(double fee) {
		this.fee = fee;
	}
}
