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
public class ManageAdministratorService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createAdministrator(int modelId,int administratorId) throws PreconditionException{
		Model model = (Model)GetData(DM.getModelDao().findById(modelId));
		Administrator administrator = (Administrator)GetData(DM.getAdministratorDao().findById(administratorId));
		
		if(StandardOPs.oclIsUndefined(model) == false && (StandardOPs.oclIsUndefined(administrator) == true || (StandardOPs.oclIsUndefined(administrator) == false && administrator!= null)))
		{
			if(StandardOPs.oclIsUndefined(administrator) == false){
				model.getContainedAdministrator().add(administrator);
			return true;
			
			}else{
				Administrator ator = new Administrator();
			ator.setId(administratorId);
			DM.getAdministratorDao().save(ator);
			model.getContainedAdministrator().add(ator);
			return true;
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteAdministrator(int modelId,int administratorId) throws PreconditionException{
		Model model = (Model)GetData(DM.getModelDao().findById(modelId));
		Administrator administrator = (Administrator)GetData(DM.getAdministratorDao().findById(administratorId));
		
		if(StandardOPs.oclIsUndefined(model) == false && StandardOPs.oclIsUndefined(administrator) == false)
		{
			return true;
			
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
