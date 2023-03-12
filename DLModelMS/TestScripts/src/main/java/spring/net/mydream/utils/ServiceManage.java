package spring.net.mydream.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.net.mydream.service.*;
@Component
	public class ServiceManage {
	@Autowired
	private DLMMSSystem dLMMSSystem;
	@Autowired
	private ManageAdministratorService manageAdministratorService;
	@Autowired
	private ManageModelService manageModelService;
	@Autowired
	private ManageOnlineModelService manageOnlineModelService;
	@Autowired
	private ManageAPIService manageAPIService;
	@Autowired
	private ManageDataSetService manageDataSetService;
	@Autowired
	private ManageModelAccessService manageModelAccessService;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	public Object getService(String name) {
	if("DLMMSSystem".equals(name)) {
			return dLMMSSystem;
		}
		else if("ManageAdministratorService".equals(name)) {
			return manageAdministratorService;
		}
		else if("ManageModelService".equals(name)) {
			return manageModelService;
		}
		else if("ManageOnlineModelService".equals(name)) {
			return manageOnlineModelService;
		}
		else if("ManageAPIService".equals(name)) {
			return manageAPIService;
		}
		else if("ManageDataSetService".equals(name)) {
			return manageDataSetService;
		}
		else if("ManageModelAccessService".equals(name)) {
			return manageModelAccessService;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		return null;
	}
	}
	