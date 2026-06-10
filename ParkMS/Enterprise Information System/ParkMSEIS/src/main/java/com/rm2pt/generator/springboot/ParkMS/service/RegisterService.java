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
public class RegisterService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean registerMember(int memberID,String name) throws PreconditionException{
		Member CurrentMember=(Member)currentUtils.getAttribute("CurrentMember");
		Member member = (Member)GetData(DM.getMemberDao().findById(memberID));
		
		if(StandardOPs.oclIsUndefined(member) == true)
		{
			Member newMember = new Member();
			newMember.setId(memberID);
			newMember.setName(name);
			DM.getMemberDao().save(newMember);
			CurrentMember = newMember;
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean registerVehicle(int vehicleID,String plateNumber,Integer type) throws PreconditionException{
		Member CurrentMember=(Member)currentUtils.getAttribute("CurrentMember");
		Vehicle vehicle = (Vehicle)GetData(DM.getVehicleDao().findById(vehicleID));
		
		if(StandardOPs.oclIsUndefined(CurrentMember) == false && StandardOPs.oclIsUndefined(vehicle) == true)
		{
			Vehicle newVehicle = new Vehicle();
			newVehicle.setId(vehicleID);
			newVehicle.setPlateNumber(plateNumber);
			newVehicle.setType(type);
			DM.getVehicleDao().save(newVehicle);
			CurrentMember.getOwningVehicles().add(newVehicle);
			newVehicle.setOwnedMember(CurrentMember);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
