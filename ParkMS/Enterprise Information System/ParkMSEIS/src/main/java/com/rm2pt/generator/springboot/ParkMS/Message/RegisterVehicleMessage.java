package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class RegisterVehicleMessage{
	public int vehicleID;
	public int getVehicleID() {
		return vehicleID;
	}
					
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
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
}
