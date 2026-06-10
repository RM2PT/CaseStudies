package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class CreateVehicleMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
	public String platenumber;
	public String getPlatenumber() {
		return platenumber;
	}
					
	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}
	public Integer type;
	public Integer getType() {
		return type;
	}
					
	public void setType(Integer type) {
		this.type = type;
	}
}
