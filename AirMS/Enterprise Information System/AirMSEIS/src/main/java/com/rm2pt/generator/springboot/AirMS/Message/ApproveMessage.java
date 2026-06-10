package com.rm2pt.generator.springboot.AirMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.AirMS.entity.*;

public class ApproveMessage{
	public int sid;
	public int getSid() {
		return sid;
	}
					
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int rid;
	public int getRid() {
		return rid;
	}
					
	public void setRid(int rid) {
		this.rid = rid;
	}
	public Boolean reject;
	public Boolean getReject() {
		return reject;
	}
					
	public void setReject(Boolean reject) {
		this.reject = reject;
	}
	public String suggestion;
	public String getSuggestion() {
		return suggestion;
	}
					
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
}
