package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class RechargeMessage{
	public int memberID;
	public int getMemberID() {
		return memberID;
	}
					
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public double amount;
	public double getAmount() {
		return amount;
	}
					
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
