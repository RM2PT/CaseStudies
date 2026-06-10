package com.rm2pt.generator.springboot.TakeOutMS.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;import org.springframework.stereotype.Component;
import com.rm2pt.generator.springboot.TakeOutMS.service.*;
@Component
	public class ServiceManage {
	@Lazy
	@Autowired
	private TakeoutSystem takeoutSystem;
	@Lazy
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Lazy
	@Autowired
	private ProcessOrderService processOrderService;
	@Lazy
	@Autowired
	private ManageItemCRUDService manageItemCRUDService;
	@Lazy
	@Autowired
	private ManageStoreCRUDService manageStoreCRUDService;
	@Lazy
	@Autowired
	private ManageDiliveryCRUDService manageDiliveryCRUDService;
	public Object getService(String name) {
	if("TakeoutSystem".equals(name)) {
			return takeoutSystem;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("ProcessOrderService".equals(name)) {
			return processOrderService;
		}
		else if("ManageItemCRUDService".equals(name)) {
			return manageItemCRUDService;
		}
		else if("ManageStoreCRUDService".equals(name)) {
			return manageStoreCRUDService;
		}
		else if("ManageDiliveryCRUDService".equals(name)) {
			return manageDiliveryCRUDService;
		}
		return null;
	}
	}
	