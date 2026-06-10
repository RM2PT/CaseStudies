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
public class RepairService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public ApprovalHistory approve(int sid,int rid,Boolean reject,String suggestion) throws PreconditionException{
		Repair rep = (Repair)GetData(DM.getRepairDao().findById(rid));
		Staff sta = (Staff)GetData(DM.getStaffDao().findById(sid));
		
		if(StandardOPs.oclIsUndefined(rep) == false && StandardOPs.oclIsUndefined(sta) == false)
		{
			ApprovalHistory ah = new ApprovalHistory();
			ah.setReject(reject);
			ah.setSuggestion(suggestion);
			DM.getApprovalHistoryDao().save(ah);
			rep.getHistory().add(ah);
			if(reject!=false){
				if(rep.getProcess() == 0 && sta.getRole() == 1){
				rep.setProcess(1);
			
			}else{
				if(rep.getProcess() == 1 && sta.getRole() == 2){
				rep.setProcess(2);
			
			}else{
				if(rep.getProcess() == 2 && sta.getRole() == 3){
				rep.setProcess(3);
			
			}
			}
			
			}
			
			}else{
				rep.setProcess(5);
			
			}
			DM.getRepairDao().save(rep);
			return ah;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean finishRepair(int id,int sid,int did,String res) throws PreconditionException{
		Repair rep = (Repair)GetData(DM.getRepairDao().findById(id));
		Staff sta = (Staff)GetData(DM.getStaffDao().findById(sid));
		Device dev = (Device)GetData(DM.getDeviceDao().findById(did));
		
		if(dev.getContacts() == sta && sta.getRole() == 3)
		{
			rep.setProcess(7);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean feedback(int id,int sid,int score,String des) throws PreconditionException{
		Repair rep = (Repair)GetData(DM.getRepairDao().findById(id));
		Staff sta = (Staff)GetData(DM.getStaffDao().findById(sid));
		
		if(rep.getRaiseStaff() == sta && sta.getRole() == 0 && rep.getProcess() == 7)
		{
			rep.setScore(score);
			if(score >= 3){
				rep.setClose(true);
			
			}else{
				rep.setClose(false);
			rep.setDescription(des);
			rep.setProcess(0);
			
			}
			DM.getRepairDao().save(rep);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
