package spring.net.mydream.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.net.mydream.service.*;
@Component
	public class ServiceManage {
	@Autowired
	private MicroKnowledgeSystem microKnowledgeSystem;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Autowired
	private BasicInfoManageService basicInfoManageService;
	@Autowired
	private MultiVersionManagementService multiVersionManagementService;
	public Object getService(String name) {
	if("MicroKnowledgeSystem".equals(name)) {
			return microKnowledgeSystem;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("BasicInfoManageService".equals(name)) {
			return basicInfoManageService;
		}
		else if("MultiVersionManagementService".equals(name)) {
			return multiVersionManagementService;
		}
		return null;
	}
	}
	