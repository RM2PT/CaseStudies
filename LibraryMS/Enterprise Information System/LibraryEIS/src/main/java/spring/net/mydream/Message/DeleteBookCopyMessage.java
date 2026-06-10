package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DeleteBookCopyMessage{
	public String barcode;
	public String getBarcode() {
		return barcode;
	}
					
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
}
