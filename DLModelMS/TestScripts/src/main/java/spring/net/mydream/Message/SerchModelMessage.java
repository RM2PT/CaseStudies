package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SerchModelMessage{
	public int modelId;
	public int getModelId() {
		return modelId;
	}
					
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
}
