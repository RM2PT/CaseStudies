package com.rm2pt.generator.springboot.DLModelMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public class ModifyRunningModelMessage{
	public String runningModelId;
	public String getRunningModelId() {
		return runningModelId;
	}
					
	public void setRunningModelId(String runningModelId) {
		this.runningModelId = runningModelId;
	}
	public String assignedResource;
	public String getAssignedResource() {
		return assignedResource;
	}
					
	public void setAssignedResource(String assignedResource) {
		this.assignedResource = assignedResource;
	}
	public String api;
	public String getApi() {
		return api;
	}
					
	public void setApi(String api) {
		this.api = api;
	}
}
