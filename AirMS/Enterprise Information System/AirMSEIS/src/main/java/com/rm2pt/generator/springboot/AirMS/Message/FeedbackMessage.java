package com.rm2pt.generator.springboot.AirMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.AirMS.entity.*;

public class FeedbackMessage{
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
	public int score;
	public int getScore() {
		return score;
	}
					
	public void setScore(int score) {
		this.score = score;
	}
	public String des;
	public String getDes() {
		return des;
	}
					
	public void setDes(String des) {
		this.des = des;
	}
}
