package com.rm2pt.generator.springboot.AirMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.AirMS.entity.*;

public class FinishRepairMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
	public int sid;
	public int getSid() {
		return sid;
	}
					
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int did;
	public int getDid() {
		return did;
	}
					
	public void setDid(int did) {
		this.did = did;
	}
	public String res;
	public String getRes() {
		return res;
	}
					
	public void setRes(String res) {
		this.res = res;
	}
}
