package com.rm2pt.generator.springboot.MicroK.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rm2pt.generator.springboot.MicroK.entity.*;
import com.rm2pt.generator.springboot.MicroK.utils.DaoManage;
import com.rm2pt.generator.springboot.MicroK.utils.PreconditionException;
import com.rm2pt.generator.springboot.MicroK.utils.ServiceManage;
import com.rm2pt.generator.springboot.MicroK.utils.StandardOPs;
import com.rm2pt.generator.springboot.MicroK.redis.CurrentUtils;

@Transactional
@Service
public class MicroKnowledgeSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean logIn(String userId,String password) throws PreconditionException{
		User CurrentUser=(User)currentUtils.getAttribute("CurrentUser");
		User user = (User)GetData(DM.getUserDao().findById(userId));
		
		if(StandardOPs.oclIsUndefined(user) == false && user.getPassword() == password)
		{
			currentUtils.setAttribute("CurrentUser" , user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<User> searchUserByName(String name) throws PreconditionException{
		
		if(name!="")
		{
			return DM.getUserDao().findByName(name);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Microknowledge> listMicroknowledgeOfUser(String id) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user) == false)
		{
			return user.getContainedMicroknowledge();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Microknowledge> searchMicroknowledge(String keywords) throws PreconditionException{
		
		if(keywords!="")
		{
			return DM.getMicroknowledgeDao().findByKeywords(keywords);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Microknowledge viewMicroknowledge(String id) throws PreconditionException{
		Microknowledge CurrentMicroknowledge=(Microknowledge)currentUtils.getAttribute("CurrentMicroknowledge");
		Microknowledge mk = (Microknowledge)GetData(DM.getMicroknowledgeDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(mk) == false)
		{
			CurrentMicroknowledge = mk;
			return mk;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean starMicroknowledge() throws PreconditionException{
		User CurrentUser=(User)currentUtils.getAttribute("CurrentUser");
		Microknowledge CurrentMicroknowledge=(Microknowledge)currentUtils.getAttribute("CurrentMicroknowledge");
		
		if(StandardOPs.oclIsUndefined(CurrentMicroknowledge) == false && StandardOPs.oclIsUndefined(CurrentUser) == false)
		{
			CurrentUser.getStaredMicroknowledge().add(CurrentMicroknowledge);
			CurrentMicroknowledge.setStarNumber(CurrentMicroknowledge.getStarNumber() + 1);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean writeComment(String content) throws PreconditionException{
		User CurrentUser=(User)currentUtils.getAttribute("CurrentUser");
		Microknowledge CurrentMicroknowledge=(Microknowledge)currentUtils.getAttribute("CurrentMicroknowledge");
		
		if(StandardOPs.oclIsUndefined(CurrentMicroknowledge) == false && StandardOPs.oclIsUndefined(CurrentUser) == false)
		{
			Comment comment = new Comment();
			comment.setContent(content);
			comment.setWritingTime(new Date());
			DM.getCommentDao().save(comment);
			CurrentMicroknowledge.getContainedComment().add(comment);
			comment.setCommenttoMicroknowledge(CurrentMicroknowledge);
			CurrentUser.getReadertoComment().add(comment);
			comment.setCommenttoReader(CurrentUser);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Microknowledge> listStaredMicroknowledge() throws PreconditionException{
		User CurrentUser=(User)currentUtils.getAttribute("CurrentUser");
		
		if(StandardOPs.oclIsUndefined(CurrentUser) == false)
		{
			return CurrentUser.getStaredMicroknowledge();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				

	public static Object GetData(Object op) {
		return op;
	}
}
