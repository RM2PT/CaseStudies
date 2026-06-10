package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ChangePriceMessage{
	public int barcode;
	public int getBarcode() {
		return barcode;
	}
					
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public double newPrice;
	public double getNewPrice() {
		return newPrice;
	}
					
	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}
}
