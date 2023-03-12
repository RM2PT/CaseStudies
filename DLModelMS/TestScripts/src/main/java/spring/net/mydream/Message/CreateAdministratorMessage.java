package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateAdministratorMessage{
	public int modelId;
	public int getModelId() {
		return modelId;
	}
					
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public int administratorId;
	public int getAdministratorId() {
		return administratorId;
	}
					
	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}
}
