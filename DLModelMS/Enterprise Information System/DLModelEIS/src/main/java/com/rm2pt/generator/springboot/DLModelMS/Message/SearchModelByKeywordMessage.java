package com.rm2pt.generator.springboot.DLModelMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public class SearchModelByKeywordMessage{
	public String keyword;
	public String getKeyword() {
		return keyword;
	}
					
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
