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
public class AutomaticEntryService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean automaticEntry(String plateNumber,Date time) throws PreconditionException{
		int RecordID=(int)currentUtils.getAttribute("RecordID");
		Park CurrentPark=(Park)currentUtils.getAttribute("CurrentPark");
		ParkRecord isParking = DM.getParkRecordDao().findByPlateNumberAndIsParking(plateNumber,true);
		
		if(StandardOPs.oclIsUndefined(CurrentPark) == false && CurrentPark.getIsOpened() == true && StandardOPs.oclIsUndefined(isParking) == true)
		{
			ParkRecord parkRecord = new ParkRecord();
			parkRecord.setPlateNumber(plateNumber);
			parkRecord.setEntryTime(time);
			parkRecord.setIsParking(true);
			parkRecord.setId((Integer)currentUtils.getAttribute("RecordID") + 1);
			currentUtils.setAttribute("RecordID" , (Integer)currentUtils.getAttribute("RecordID"));
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
