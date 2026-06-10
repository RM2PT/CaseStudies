package spring.net.mydream.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.net.mydream.service.*;
@Component
	public class ServiceManage {
	@Autowired
	private AutomatedTellerMachineSystem automatedTellerMachineSystem;
	@Autowired
	private ManageBankCardCRUDService manageBankCardCRUDService;
	@Autowired
	private ManageUserCRUDService manageUserCRUDService;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	public Object getService(String name) {
	if("AutomatedTellerMachineSystem".equals(name)) {
			return automatedTellerMachineSystem;
		}
		else if("ManageBankCardCRUDService".equals(name)) {
			return manageBankCardCRUDService;
		}
		else if("ManageUserCRUDService".equals(name)) {
			return manageUserCRUDService;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		return null;
	}
	}
	