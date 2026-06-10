package com.rm2pt.generator.springboot.ParkMS.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;import org.springframework.stereotype.Component;
import com.rm2pt.generator.springboot.ParkMS.service.*;
@Component
	public class ServiceManage {
	@Lazy
	@Autowired
	private ParkMSSystem parkMSSystem;
	@Lazy
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Lazy
	@Autowired
	private SetPriceService setPriceService;
	@Lazy
	@Autowired
	private GetHistoryService getHistoryService;
	@Lazy
	@Autowired
	private AutomaticEntryService automaticEntryService;
	@Lazy
	@Autowired
	private ManuallyAllowOutService manuallyAllowOutService;
	@Lazy
	@Autowired
	private ManuallyAllowEntryService manuallyAllowEntryService;
	@Lazy
	@Autowired
	private AutomaticOutService automaticOutService;
	@Lazy
	@Autowired
	private RegisterService registerService;
	@Lazy
	@Autowired
	private RechargeService rechargeService;
	@Lazy
	@Autowired
	private ManageParkCRUDService manageParkCRUDService;
	@Lazy
	@Autowired
	private ManageVehicleCRUDService manageVehicleCRUDService;
	public Object getService(String name) {
	if("ParkMSSystem".equals(name)) {
			return parkMSSystem;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("SetPriceService".equals(name)) {
			return setPriceService;
		}
		else if("GetHistoryService".equals(name)) {
			return getHistoryService;
		}
		else if("AutomaticEntryService".equals(name)) {
			return automaticEntryService;
		}
		else if("ManuallyAllowOutService".equals(name)) {
			return manuallyAllowOutService;
		}
		else if("ManuallyAllowEntryService".equals(name)) {
			return manuallyAllowEntryService;
		}
		else if("AutomaticOutService".equals(name)) {
			return automaticOutService;
		}
		else if("RegisterService".equals(name)) {
			return registerService;
		}
		else if("RechargeService".equals(name)) {
			return rechargeService;
		}
		else if("ManageParkCRUDService".equals(name)) {
			return manageParkCRUDService;
		}
		else if("ManageVehicleCRUDService".equals(name)) {
			return manageVehicleCRUDService;
		}
		return null;
	}
	}
	