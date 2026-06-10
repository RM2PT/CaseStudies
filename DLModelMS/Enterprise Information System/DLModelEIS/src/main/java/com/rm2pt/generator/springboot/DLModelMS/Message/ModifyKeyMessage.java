package com.rm2pt.generator.springboot.DLModelMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public class ModifyKeyMessage{
	public String keyId;
	public String getKeyId() {
		return keyId;
	}
					
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}
	public Boolean isValid;
	public Boolean getIsValid() {
		return isValid;
	}
					
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
}
