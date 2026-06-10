package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class AddBookCopyMessage{
	public String callNo;
	public String getCallNo() {
		return callNo;
	}
					
	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}
	public String barcode;
	public String getBarcode() {
		return barcode;
	}
					
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String location;
	public String getLocation() {
		return location;
	}
					
	public void setLocation(String location) {
		this.location = location;
	}
}
