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
public class ManuallyAllowEntryService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean manuallyAllowEntry(String plateNumber,Integer type,Date time) throws PreconditionException{
		Park CurrentPark=(Park)currentUtils.getAttribute("CurrentPark");
		Vehicle vehicle = DM.getVehicleDao().findByPlateNumber(plateNumber);
		
		if(StandardOPs.oclIsUndefined(CurrentPark) == false && CurrentPark.getIsOpened() == true)
		{
			ParkRecord parkRecord = new ParkRecord();
			parkRecord.setId(StandardOPs.size(CurrentPark.getOwningRecords()));
			parkRecord.setPlateNumber(plateNumber);
			parkRecord.setType(type);
			parkRecord.setEntryTime(time);
			parkRecord.setIsParking(true);
			DM.getParkRecordDao().save(parkRecord);
			CurrentPark.getOwningRecords().add(parkRecord);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
