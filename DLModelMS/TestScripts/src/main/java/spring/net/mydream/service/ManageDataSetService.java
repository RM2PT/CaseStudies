package spring.net.mydream.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.net.mydream.entity.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.ServiceManage;
import spring.net.mydream.utils.StandardOPs;
import spring.net.mydream.redis.CurrentUtils;

@Transactional
@Service
public class ManageDataSetService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createDataSet(int id,String content) throws PreconditionException{
		DataSet a = (DataSet)GetData(DM.getDataSetDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(a) == true)
		{
			DataSet e = new DataSet();
			e.setId(id);
			e.setContent(content);
			DM.getDataSetDao().save(e);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDataSet(int id) throws PreconditionException{
		DataSet a = (DataSet)GetData(DM.getDataSetDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(a) == false && a!= null)
		{
			DM.getDataSetDao().delete(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDataSet(int id,String content) throws PreconditionException{
		DataSet a = (DataSet)GetData(DM.getDataSetDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			a.setId(id);
			a.setContent(content);
			DM.getDataSetDao().save(a);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public DataSet queryDataSet(int id) throws PreconditionException{
		DataSet a = (DataSet)GetData(DM.getDataSetDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(a) == false)
		{
			return a;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
