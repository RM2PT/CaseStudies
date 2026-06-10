package com.rm2pt.generator.springboot.MicroK.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public class WriteCommentMessage{
	public String content;
	public String getContent() {
		return content;
	}
					
	public void setContent(String content) {
		this.content = content;
	}
}
