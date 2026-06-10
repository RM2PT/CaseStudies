package com.rm2pt.generator.springboot.DLModelMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public class DownModelMessage{
	public String id;
	public String getId() {
		return id;
	}
					
	public void setId(String id) {
		this.id = id;
	}
}
