package com.rm2pt.generator.springboot.DLModelMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public class UpdateModelInformationMessage{
	public String id;
	public String getId() {
		return id;
	}
					
	public void setId(String id) {
		this.id = id;
	}
	public String title;
	public String getTitle() {
		return title;
	}
					
	public void setTitle(String title) {
		this.title = title;
	}
	public String keyword;
	public String getKeyword() {
		return keyword;
	}
					
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String version;
	public String getVersion() {
		return version;
	}
					
	public void setVersion(String version) {
		this.version = version;
	}
	public String description;
	public String getDescription() {
		return description;
	}
					
	public void setDescription(String description) {
		this.description = description;
	}
}
