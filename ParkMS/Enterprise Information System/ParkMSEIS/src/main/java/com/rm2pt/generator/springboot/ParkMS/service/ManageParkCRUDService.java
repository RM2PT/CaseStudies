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
public class ManageParkCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createPark(int id,String name,String location,double smallprice,double largeprice,double motoprice) throws PreconditionException{
		Park park = (Park)GetData(DM.getParkDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(park) == true)
		{
			Park par = new Park();
			par.setId(id);
			par.setName(name);
			par.setLocation(location);
			par.setSmallPrice(smallprice);
			par.setLargePrice(largeprice);
			par.setMotoPrice(motoprice);
			DM.getParkDao().save(par);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Park queryPark(int id) throws PreconditionException{
		Park park = (Park)GetData(DM.getParkDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(park) == false)
		{
			return park;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyPark(int id,String name,String location,double smallprice,double largeprice,double motoprice) throws PreconditionException{
		Park park = (Park)GetData(DM.getParkDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(park) == false)
		{
			park.setId(id);
			park.setName(name);
			park.setLocation(location);
			park.setSmallPrice(smallprice);
			park.setLargePrice(largeprice);
			park.setMotoPrice(motoprice);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deletePark(int id) throws PreconditionException{
		Park park = (Park)GetData(DM.getParkDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(park) == false && park!= null)
		{
			DM.getParkDao().delete(park);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
