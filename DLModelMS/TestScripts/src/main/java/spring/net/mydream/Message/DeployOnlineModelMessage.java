package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DeployOnlineModelMessage{
	public int modelId;
	public int getModelId() {
		return modelId;
	}
					
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public int onlineModelId;
	public int getOnlineModelId() {
		return onlineModelId;
	}
					
	public void setOnlineModelId(int onlineModelId) {
		this.onlineModelId = onlineModelId;
	}
	public String assignedResource;
	public String getAssignedResource() {
		return assignedResource;
	}
					
	public void setAssignedResource(String assignedResource) {
		this.assignedResource = assignedResource;
	}
}
