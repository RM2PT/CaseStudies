package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class GetHistoryByPlateNumberMessage{
	public String plateNumber;
	public String getPlateNumber() {
		return plateNumber;
	}
					
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
}
