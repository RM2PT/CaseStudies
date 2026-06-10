package com.rm2pt.generator.springboot.TakeOutMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public class MakeCashPaymentMessage{
	public double amount;
	public double getAmount() {
		return amount;
	}
					
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
