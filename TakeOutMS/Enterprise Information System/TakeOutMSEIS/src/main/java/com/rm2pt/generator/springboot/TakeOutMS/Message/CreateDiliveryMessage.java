package com.rm2pt.generator.springboot.TakeOutMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public class CreateDiliveryMessage{
	public String id;
	public String getId() {
		return id;
	}
					
	public void setId(String id) {
		this.id = id;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
}
