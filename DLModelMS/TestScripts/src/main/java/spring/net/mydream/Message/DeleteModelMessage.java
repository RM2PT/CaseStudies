package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DeleteModelMessage{
	public Integer modelId;
	public String getModelId() {
		return modelId;
	}
					
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
}
