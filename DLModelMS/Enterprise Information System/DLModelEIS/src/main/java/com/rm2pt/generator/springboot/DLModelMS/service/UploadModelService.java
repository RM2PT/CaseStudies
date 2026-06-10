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
public class UploadModelService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean uploadModelInformation(String id,String title,String keyword,String version,String description) throws PreconditionException{
		Model CurrentModel=(Model)currentUtils.getAttribute("CurrentModel");
		Model a = (Model)GetData(DM.getModelDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(a) == true)
		{
			Model e = new Model();
			e.setId(id);
			e.setTitle(title);
			e.setKeyword(keyword);
			e.setVersion(version);
			e.setDescription(description);
			e.setLastUpdateTime(new Date());
			DM.getModelDao().save(e);
			currentUtils.setAttribute("CurrentModel" , e);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean uploadModelAttachment() throws PreconditionException{
		Model CurrentModel=(Model)currentUtils.getAttribute("CurrentModel");
		
		if(StandardOPs.oclIsUndefined(CurrentModel) == false && StandardOPs.oclIsUndefined(CurrentModel.getModeltoAttachment()) == true)
		{
			Attachment c = new Attachment();
			c.setURL(((ThirdPartyServices) serviceManage.getService("ThirdPartyServices")).generateURL());
			CurrentModel.setModeltoAttachment(c);
			DM.getAttachmentDao().save(c);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean uploadDataSet(String id,String content) throws PreconditionException{
		Model CurrentModel=(Model)currentUtils.getAttribute("CurrentModel");
		DataSet a = (DataSet)GetData(DM.getDataSetDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(a) == true && StandardOPs.oclIsUndefined(CurrentModel) == false)
		{
			DataSet c = new DataSet();
			c.setId(id);
			c.setContent(content);
			c.setLastUpdateTime(new Date());
			DM.getDataSetDao().save(c);
			CurrentModel.getContainedDataSet().add(c);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
