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
public class ManageModelService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean updateModelInformation(String id,String title,String keyword,String version,String description) throws PreconditionException{
		Model e = (Model)GetData(DM.getModelDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(e) == false)
		{
			e.setId(id);
			e.setTitle(title);
			e.setKeyword(keyword);
			e.setVersion(version);
			e.setDescription(description);
			e.setLastUpdateTime(new Date());
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean updateDataSet(String id,String content) throws PreconditionException{
		DataSet c = (DataSet)GetData(DM.getDataSetDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(c) == false)
		{
			c.setId(id);
			c.setContent(content);
			c.setLastUpdateTime(new Date());
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
