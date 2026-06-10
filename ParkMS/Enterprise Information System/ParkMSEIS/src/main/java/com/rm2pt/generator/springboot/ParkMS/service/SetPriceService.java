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
public class SetPriceService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean setSmallPrice(int parkID,double price) throws PreconditionException{
		Park park = (Park)GetData(DM.getParkDao().findById(parkID));
		
		if(StandardOPs.oclIsUndefined(park) == false)
		{
			park.setSmallPrice(price);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean setLargePrice(int parkID,double price) throws PreconditionException{
		Park park = (Park)GetData(DM.getParkDao().findById(parkID));
		
		if(StandardOPs.oclIsUndefined(park) == false)
		{
			park.setLargePrice(price);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean setMotoPrice(int parkID,double price) throws PreconditionException{
		Park park = (Park)GetData(DM.getParkDao().findById(parkID));
		
		if(StandardOPs.oclIsUndefined(park) == false)
		{
			park.setMotoPrice(price);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
