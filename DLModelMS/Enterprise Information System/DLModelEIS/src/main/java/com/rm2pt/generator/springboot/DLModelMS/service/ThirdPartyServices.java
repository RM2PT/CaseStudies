package com.rm2pt.generator.springboot.DLModelMS.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;
import com.rm2pt.generator.springboot.DLModelMS.utils.DaoManage;
import com.rm2pt.generator.springboot.DLModelMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.DLModelMS.utils.ServiceManage;
import com.rm2pt.generator.springboot.DLModelMS.utils.StandardOPs;
import com.rm2pt.generator.springboot.DLModelMS.redis.CurrentUtils;

@Transactional
@Service
public class ThirdPartyServices{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public String generateURL() throws PreconditionException{
		
		if(true)
		{
			return "";
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean download(String url) throws PreconditionException{
		
		if(url!="")
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
