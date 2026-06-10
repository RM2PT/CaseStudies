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
public class AutomaticOutService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public double scanPlateNumber(String plateNumber,Date time) throws PreconditionException{
		double CurrentPayment=(double)currentUtils.getAttribute("CurrentPayment");
		ParkRecord parkRecord = DM.getParkRecordDao().findByPlateNumberAndIsParking(plateNumber,true);
		Vehicle vehicle = DM.getVehicleDao().findByPlateNumber(plateNumber);
		
		if(StandardOPs.oclIsUndefined(parkRecord) == false && parkRecord.getIsParking() == true)
		{
			parkRecord.setIsParking(false);
			parkRecord.setType(vehicle.getType());
			if(vehicle.getType() == VehicleType.SPECIAL.ordinal()){
				CurrentPayment = 0;
			
			}else{
				if(vehicle.getType() == VehicleType.SMALL.ordinal()){
				CurrentPayment = 1;
			
			}else{
				if(vehicle.getType() == VehicleType.LARGE.ordinal()){
				CurrentPayment = 2;
			
			}else{
				CurrentPayment = 3;
			
			}
			
			}
			
			}
			return CurrentPayment;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean onlinePay(int memberID) throws PreconditionException{
		double CurrentPayment=(double)currentUtils.getAttribute("CurrentPayment");
		Member member = (Member)GetData(DM.getMemberDao().findById(memberID));
		
		if(StandardOPs.oclIsUndefined(member) == false && member.getBalance() >= CurrentPayment)
		{
			member.setBalance(member.getBalance() - CurrentPayment);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
