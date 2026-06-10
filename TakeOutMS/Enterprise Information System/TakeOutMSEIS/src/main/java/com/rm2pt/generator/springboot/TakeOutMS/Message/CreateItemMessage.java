package com.rm2pt.generator.springboot.TakeOutMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public class CreateItemMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
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
