package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ChooseSupplierMessage{
	public int supplierID;
	public int getSupplierID() {
		return supplierID;
	}
					
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
}
