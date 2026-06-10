package com.rm2pt.generator.springboot.MicroK.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;import org.springframework.stereotype.Component;
import com.rm2pt.generator.springboot.MicroK.service.*;
@Component
	public class ServiceManage {
	@Lazy
	@Autowired
	private MicroKnowledgeSystem microKnowledgeSystem;
	@Lazy
	@Autowired
	private ManageUserService manageUserService;
	@Lazy
	@Autowired
	private ManageMicroknowledgeService manageMicroknowledgeService;
	@Lazy
	@Autowired
	private SearchMicroknowledgeService searchMicroknowledgeService;
	@Lazy
	@Autowired
	private ListMicroknowledgeOfUserService listMicroknowledgeOfUserService;
	@Lazy
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	public Object getService(String name) {
	if("MicroKnowledgeSystem".equals(name)) {
			return microKnowledgeSystem;
		}
		else if("ManageUserService".equals(name)) {
			return manageUserService;
		}
		else if("ManageMicroknowledgeService".equals(name)) {
			return manageMicroknowledgeService;
		}
		else if("SearchMicroknowledgeService".equals(name)) {
			return searchMicroknowledgeService;
		}
		else if("ListMicroknowledgeOfUserService".equals(name)) {
			return listMicroknowledgeOfUserService;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		return null;
	}
	}
	