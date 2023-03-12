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
public class MicroKnowledgeSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<Project> projectManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getProjectDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Project> relatedProjectCollection() throws PreconditionException{
		
		if(true)
		{
			return DM.getProjectDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<User> memberManage() throws PreconditionException{
		
		if(true)
		{
			return DM.getUserDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<User> memberDynamics() throws PreconditionException{
		
		if(true)
		{
			return DM.getUserDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<User> classification() throws PreconditionException{
		
		if(true)
		{
			return DM.getUserDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<MK> mKGraph() throws PreconditionException{
		
		if(true)
		{
			return DM.getMKDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<MK> mKRecommendation() throws PreconditionException{
		
		if(true)
		{
			return DM.getMKDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean contentEdit(String name,String content) throws PreconditionException{
		MK mk = DM.getMKDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(mk) == false)
		{
			mk.setContent(content);
			DM.getMKDao().save(mk);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Team> teamForum() throws PreconditionException{
		
		if(true)
		{
			return DM.getTeamDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<User> businessDataManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getUserDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<MK> mKManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getMKDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Team> teamDataManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getTeamDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<User> basicDataManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getUserDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<ActivityLog> logManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getActivityLogDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<User> userManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getUserDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Team> researchTeamManagement() throws PreconditionException{
		
		if(true)
		{
			return DM.getTeamDao().findAll();
			
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
