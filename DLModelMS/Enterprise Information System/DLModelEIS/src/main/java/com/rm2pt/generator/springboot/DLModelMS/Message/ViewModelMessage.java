package com.rm2pt.generator.springboot.DLModelMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public class ViewModelMessage{
	public String modelId;
	public String getModelId() {
		return modelId;
	}
					
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
}
