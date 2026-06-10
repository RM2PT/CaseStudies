package com.rm2pt.generator.springboot.AirMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.AirMS.entity.*;

public class CreateDeviceMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String location;
	public String getLocation() {
		return location;
	}
					
	public void setLocation(String location) {
		this.location = location;
	}
	public int contactsid;
	public int getContactsid() {
		return contactsid;
	}
					
	public void setContactsid(int contactsid) {
		this.contactsid = contactsid;
	}
}
