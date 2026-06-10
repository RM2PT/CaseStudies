package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DeleteItemMessage{
	public int barcode;
	public int getBarcode() {
		return barcode;
	}
					
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
}
