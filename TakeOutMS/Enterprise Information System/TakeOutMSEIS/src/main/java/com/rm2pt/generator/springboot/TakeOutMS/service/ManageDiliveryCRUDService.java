package com.rm2pt.generator.springboot.TakeOutMS.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;
import com.rm2pt.generator.springboot.TakeOutMS.utils.DaoManage;
import com.rm2pt.generator.springboot.TakeOutMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.TakeOutMS.utils.ServiceManage;
import com.rm2pt.generator.springboot.TakeOutMS.utils.StandardOPs;
import com.rm2pt.generator.springboot.TakeOutMS.redis.CurrentUtils;

@Transactional
@Service
public class ManageDiliveryCRUDService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createDilivery(String id,String name) throws PreconditionException{
		Dilivery CurrentDilivery=(Dilivery)currentUtils.getAttribute("CurrentDilivery");
		Dilivery di = (Dilivery)GetData(DM.getDiliveryDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(di) == true)
		{
			Dilivery temp = new Dilivery();
			temp.setId(id);
			temp.setName(name);
			DM.getDiliveryDao().save(temp);
			CurrentDilivery = temp;
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
