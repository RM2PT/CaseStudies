package com.rm2pt.generator.springboot.AirMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.AirMS.entity.*;

public class CreateStaffMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String pswd;
	public String getPswd() {
		return pswd;
	}
					
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String phone;
	public String getPhone() {
		return phone;
	}
					
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int role;
	public int getRole() {
		return role;
	}
					
	public void setRole(int role) {
		this.role = role;
	}
	public int bossid;
	public int getBossid() {
		return bossid;
	}
					
	public void setBossid(int bossid) {
		this.bossid = bossid;
	}
}
