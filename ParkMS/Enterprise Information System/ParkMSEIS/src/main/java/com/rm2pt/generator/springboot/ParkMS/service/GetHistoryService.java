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
public class GetHistoryService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

			
	// public List<ParkRecord> getHistoryByMember(int memberID) throws PreconditionException
	
			
	// public List<ParkRecord> getHistoryByOutTime(Date from,Date to) throws PreconditionException
	
			
	// public List<ParkRecord> getHistoryByEntryTime(Date from,Date to) throws PreconditionException
	
	public List<ParkRecord> getHistoryByPlateNumber(String plateNumber) throws PreconditionException{
		
		if(true)
		{
			return DM.getParkRecordDao().findByPlateNumber(plateNumber);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
