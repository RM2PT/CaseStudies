package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class OnlinePayMessage{
	public int memberID;
	public int getMemberID() {
		return memberID;
	}
					
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
}
