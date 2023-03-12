package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class UploadModelMessage{
	public int modelId;
	public int getModelId() {
		return modelId;
	}
					
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String version;
	public String getVersion() {
		return version;
	}
					
	public void setVersion(String version) {
		this.version = version;
	}
	public String location;
	public String getLocation() {
		return location;
	}
					
	public void setLocation(String location) {
		this.location = location;
	}
}
