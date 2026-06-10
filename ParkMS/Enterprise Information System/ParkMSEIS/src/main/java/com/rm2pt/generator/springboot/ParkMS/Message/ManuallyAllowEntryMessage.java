package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class ManuallyAllowEntryMessage{
	public String plateNumber;
	public String getPlateNumber() {
		return plateNumber;
	}
					
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public Integer type;
	public Integer getType() {
		return type;
	}
					
	public void setType(Integer type) {
		this.type = type;
	}
	@JsonbDateFormat("yyyy-MM-dd")
	public Date time;
	public Date getTime() {
		return time;
	}
					
	public void setTime(Date time) {
		this.time = time;
	}
}
