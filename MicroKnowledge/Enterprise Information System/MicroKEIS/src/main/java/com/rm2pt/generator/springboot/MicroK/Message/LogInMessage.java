package com.rm2pt.generator.springboot.MicroK.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public class LogInMessage{
	public String userId;
	public String getUserId() {
		return userId;
	}
					
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String password;
	public String getPassword() {
		return password;
	}
					
	public void setPassword(String password) {
		this.password = password;
	}
}
