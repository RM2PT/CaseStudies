package com.rm2pt.generator.springboot.AirMS.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.AirMS.entity.*;
import com.rm2pt.generator.springboot.AirMS.utils.DaoManage;
import com.rm2pt.generator.springboot.AirMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.AirMS.utils.ServiceManage;
import com.rm2pt.generator.springboot.AirMS.utils.StandardOPs;
import com.rm2pt.generator.springboot.AirMS.redis.CurrentUtils;

@Transactional
@Service
public class AirportSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createStaff(int id,String name,String pswd,String phone,int role,int bossid) throws PreconditionException{
		Staff sta = (Staff)GetData(DM.getStaffDao().findById(id));
		Staff bo = (Staff)GetData(DM.getStaffDao().findById(bossid));
		
		if(StandardOPs.oclIsUndefined(sta) == true)
		{
			Staff s = new Staff();
			s.setId(id);
			s.setName(name);
			s.setPassword(pswd);
			s.setPhone(phone);
			s.setRole(role);
			if(StandardOPs.oclIsUndefined(bo) == false){
				s.setBoss(bo);
			
			}DM.getStaffDao().save(s);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDevice(int id,String name,String location,int contactsid) throws PreconditionException{
		Device dev = (Device)GetData(DM.getDeviceDao().findById(id));
		Staff sta = (Staff)GetData(DM.getStaffDao().findById(contactsid));
		
		if(StandardOPs.oclIsUndefined(dev) == true && StandardOPs.oclIsUndefined(sta) == false)
		{
			Device d = new Device();
			d.setId(id);
			d.setName(name);
			d.setLocation(location);
			d.setContacts(sta);
			DM.getDeviceDao().save(dev);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
