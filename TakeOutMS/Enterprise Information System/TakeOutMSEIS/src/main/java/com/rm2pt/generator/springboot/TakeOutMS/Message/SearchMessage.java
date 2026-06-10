package com.rm2pt.generator.springboot.TakeOutMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public class SearchMessage{
	public String itemname;
	public String getItemname() {
		return itemname;
	}
					
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
}
