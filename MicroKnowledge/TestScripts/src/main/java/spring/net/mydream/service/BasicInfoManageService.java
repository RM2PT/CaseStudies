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
public class BasicInfoManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean create(String name) throws PreconditionException{
		Team team = DM.getTeamDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(team) == true)
		{
			Team t = new Team();
			t.setName(name);
			DM.getTeamDao().save(t);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Team find(String name) throws PreconditionException{
		Team team = DM.getTeamDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(team) == false)
		{
			return team;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean update(String name) throws PreconditionException{
		User user = DM.getUserDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			user.setType(1);
			DM.getUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean addComment(String name,String content) throws PreconditionException{
		Comment cm = DM.getCommentDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(cm) == true)
		{
			Comment ccmm = new Comment();
			ccmm.setName(name);
			ccmm.setContent(content);
			DM.getCommentDao().save(ccmm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean addProjectHistory(String title) throws PreconditionException{
		ProjectHistory projhis = DM.getProjectHistoryDao().findByTitle(title);
		
		if(StandardOPs.oclIsUndefined(projhis) == true)
		{
			ProjectHistory pj = new ProjectHistory();
			pj.setTitle(title);
			DM.getProjectHistoryDao().save(pj);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean updateComment(String name,String content) throws PreconditionException{
		Comment cm = DM.getCommentDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(cm) == false)
		{
			cm.setContent(content);
			DM.getCommentDao().save(cm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean updateProjectHistory(String title) throws PreconditionException{
		ProjectHistory projhis = DM.getProjectHistoryDao().findByTitle(title);
		
		if(StandardOPs.oclIsUndefined(projhis) == false)
		{
			DM.getProjectHistoryDao().save(projhis);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean addMK(String name,String content) throws PreconditionException{
		MK mk = DM.getMKDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(mk) == true)
		{
			MK mmkk = new MK();
			mmkk.setName(name);
			mmkk.setContent(content);
			DM.getMKDao().save(mmkk);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean updateMK(String name,String content) throws PreconditionException{
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
	public List<ProjectHistory> listProjectHistory() throws PreconditionException{
		
		if(true)
		{
			return DM.getProjectHistoryDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<MK> listMK() throws PreconditionException{
		
		if(true)
		{
			return DM.getMKDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean addGroup(String name,String creator) throws PreconditionException{
		Grp gp = DM.getGrpDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(gp) == true)
		{
			Grp gg = new Grp();
			gg.setName(name);
			gg.setCreator(creator);
			DM.getGrpDao().save(gg);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean updateGroup(String name,String creator) throws PreconditionException{
		Grp gp = DM.getGrpDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(gp) == false)
		{
			gp.setCreator(creator);
			DM.getGrpDao().save(gp);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Grp> listGroup() throws PreconditionException{
		
		if(true)
		{
			return DM.getGrpDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean labelMK(String mkname,String teamname) throws PreconditionException{
		MK mk = DM.getMKDao().findByName(mkname);
		Team tm = DM.getTeamDao().findByName(teamname);
		
		if(StandardOPs.oclIsUndefined(mk) == false && StandardOPs.oclIsUndefined(tm) == false)
		{
			mk.setMk2team(tm);
			tm.getTeam2mk().add(mk);
			DM.getMKDao().save(mk);
			DM.getTeamDao().save(tm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean labelComment(String cmname,String teamname) throws PreconditionException{
		Comment cm = DM.getCommentDao().findByName(cmname);
		Team tm = DM.getTeamDao().findByName(teamname);
		
		if(StandardOPs.oclIsUndefined(cm) == false && StandardOPs.oclIsUndefined(tm) == false)
		{
			cm.setComment2team(tm);
			tm.getTeam2comment().add(cm);
			DM.getCommentDao().save(cm);
			DM.getTeamDao().save(tm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean addCommentReply(String cmname,String content) throws PreconditionException{
		Comment cm = DM.getCommentDao().findByName(cmname);
		
		if(StandardOPs.oclIsUndefined(cm) == false)
		{
			CommentReply rp = new CommentReply();
			rp.setContent(content);
			cm.getComment2commentreply().add(rp);
			rp.setCommentreply2comment(cm);
			DM.getCommentReplyDao().save(rp);
			DM.getCommentDao().save(cm);
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
