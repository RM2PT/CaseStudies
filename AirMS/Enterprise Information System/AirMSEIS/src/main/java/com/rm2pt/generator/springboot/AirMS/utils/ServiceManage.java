package com.rm2pt.generator.springboot.AirMS.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;import org.springframework.stereotype.Component;
import com.rm2pt.generator.springboot.AirMS.service.*;
@Component
	public class ServiceManage {
	@Lazy
	@Autowired
	private AirportSystem airportSystem;
	@Lazy
	@Autowired
	private RepairService repairService;
	@Lazy
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Lazy
	@Autowired
	private RaiseRepairService raiseRepairService;
	public Object getService(String name) {
	if("AirportSystem".equals(name)) {
			return airportSystem;
		}
		else if("RepairService".equals(name)) {
			return repairService;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("RaiseRepairService".equals(name)) {
			return raiseRepairService;
		}
		return null;
	}
	}
	