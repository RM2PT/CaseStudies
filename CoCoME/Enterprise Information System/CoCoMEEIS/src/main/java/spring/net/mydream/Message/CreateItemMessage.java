package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateItemMessage{
	public int barcode;
	public int getBarcode() {
		return barcode;
	}
					
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public double price;
	public double getPrice() {
		return price;
	}
					
	public void setPrice(double price) {
		this.price = price;
	}
	public int stocknumber;
	public int getStocknumber() {
		return stocknumber;
	}
					
	public void setStocknumber(int stocknumber) {
		this.stocknumber = stocknumber;
	}
	public double orderprice;
	public double getOrderprice() {
		return orderprice;
	}
					
	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}
}
