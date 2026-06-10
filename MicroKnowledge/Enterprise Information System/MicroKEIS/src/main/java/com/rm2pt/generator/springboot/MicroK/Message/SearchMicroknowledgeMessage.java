package com.rm2pt.generator.springboot.MicroK.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public class SearchMicroknowledgeMessage{
	public String keywords;
	public String getKeywords() {
		return keywords;
	}
					
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
