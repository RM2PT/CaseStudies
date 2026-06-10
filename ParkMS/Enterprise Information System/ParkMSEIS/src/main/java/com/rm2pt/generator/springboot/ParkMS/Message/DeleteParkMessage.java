package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class DeleteParkMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
}
