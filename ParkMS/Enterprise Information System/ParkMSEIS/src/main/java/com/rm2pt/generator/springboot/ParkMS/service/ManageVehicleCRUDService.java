package com.rm2pt.generator.springboot.ParkMS.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.ParkMS.entity.*;
import com.rm2pt.generator.springboot.ParkMS.utils.DaoManage;
import com.rm2pt.generator.springboot.ParkMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.ParkMS.utils.ServiceManage;
import com.rm2pt.generator.springboot.ParkMS.utils.StandardOPs;
import com.rm2pt.generator.springboot.ParkMS.redis.CurrentUtils;

@Transactional
@Service
public class ManageVehicleCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createVehicle(int id,String platenumber,Integer type) throws PreconditionException{
		Vehicle vehicle = (Vehicle)GetData(DM.getVehicleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(vehicle) == true)
		{
			Vehicle veh = new Vehicle();
			veh.setId(id);
			veh.setPlateNumber(platenumber);
			veh.setType(type);
			DM.getVehicleDao().save(veh);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Vehicle queryVehicle(int id) throws PreconditionException{
		Vehicle vehicle = (Vehicle)GetData(DM.getVehicleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(vehicle) == false)
		{
			return vehicle;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyVehicle(int id,String platenumber,Integer type) throws PreconditionException{
		Vehicle vehicle = (Vehicle)GetData(DM.getVehicleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(vehicle) == false)
		{
			vehicle.setId(id);
			vehicle.setPlateNumber(platenumber);
			vehicle.setType(type);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteVehicle(int id) throws PreconditionException{
		Vehicle vehicle = (Vehicle)GetData(DM.getVehicleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(vehicle) == false && vehicle!= null)
		{
			DM.getVehicleDao().delete(vehicle);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
