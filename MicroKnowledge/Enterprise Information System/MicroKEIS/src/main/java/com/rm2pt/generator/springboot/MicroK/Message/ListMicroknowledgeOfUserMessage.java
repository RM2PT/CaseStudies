package com.rm2pt.generator.springboot.MicroK.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public class ListMicroknowledgeOfUserMessage{
	public String id;
	public String getId() {
		return id;
	}
					
	public void setId(String id) {
		this.id = id;
	}
}
