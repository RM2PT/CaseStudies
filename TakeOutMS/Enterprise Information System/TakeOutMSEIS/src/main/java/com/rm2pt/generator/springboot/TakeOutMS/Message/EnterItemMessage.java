package com.rm2pt.generator.springboot.TakeOutMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public class EnterItemMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
	public int quantity;
	public int getQuantity() {
		return quantity;
	}
					
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
