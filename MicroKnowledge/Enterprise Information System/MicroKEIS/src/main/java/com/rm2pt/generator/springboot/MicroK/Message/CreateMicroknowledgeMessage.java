package com.rm2pt.generator.springboot.MicroK.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public class CreateMicroknowledgeMessage{
	public String id;
	public String getId() {
		return id;
	}
					
	public void setId(String id) {
		this.id = id;
	}
	public String keywords;
	public String getKeywords() {
		return keywords;
	}
					
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String content;
	public String getContent() {
		return content;
	}
					
	public void setContent(String content) {
		this.content = content;
	}
}
