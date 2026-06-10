package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ModifyBookCopyMessage{
	public String barcode;
	public String getBarcode() {
		return barcode;
	}
					
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public Integer status;
	public Integer getStatus() {
		return status;
	}
					
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String location;
	public String getLocation() {
		return location;
	}
					
	public void setLocation(String location) {
		this.location = location;
	}
	public Boolean isreserved;
	public Boolean getIsreserved() {
		return isreserved;
	}
					
	public void setIsreserved(Boolean isreserved) {
		this.isreserved = isreserved;
	}
}
