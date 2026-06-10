package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class CreateParkMessage{
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
	public double smallprice;
	public double getSmallprice() {
		return smallprice;
	}
					
	public void setSmallprice(double smallprice) {
		this.smallprice = smallprice;
	}
	public double largeprice;
	public double getLargeprice() {
		return largeprice;
	}
					
	public void setLargeprice(double largeprice) {
		this.largeprice = largeprice;
	}
	public double motoprice;
	public double getMotoprice() {
		return motoprice;
	}
					
	public void setMotoprice(double motoprice) {
		this.motoprice = motoprice;
	}
}
