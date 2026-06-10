package com.rm2pt.generator.springboot.DLModelMS.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;import org.springframework.stereotype.Component;
import com.rm2pt.generator.springboot.DLModelMS.service.*;
@Component
	public class ServiceManage {
	@Lazy
	@Autowired
	private DLModelMS1System dLModelMS1System;
	@Lazy
	@Autowired
	private ManageModelService manageModelService;
	@Lazy
	@Autowired
	private ManageRunningModelService manageRunningModelService;
	@Lazy
	@Autowired
	private UploadModelService uploadModelService;
	@Lazy
	@Autowired
	private DeployModelService deployModelService;
	@Lazy
	@Autowired
	private DownloadModelService downloadModelService;
	@Lazy
	@Autowired
	private AskForAPIService askForAPIService;
	@Lazy
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	public Object getService(String name) {
	if("DLModelMS1System".equals(name)) {
			return dLModelMS1System;
		}
		else if("ManageModelService".equals(name)) {
			return manageModelService;
		}
		else if("ManageRunningModelService".equals(name)) {
			return manageRunningModelService;
		}
		else if("UploadModelService".equals(name)) {
			return uploadModelService;
		}
		else if("DeployModelService".equals(name)) {
			return deployModelService;
		}
		else if("DownloadModelService".equals(name)) {
			return downloadModelService;
		}
		else if("AskForAPIService".equals(name)) {
			return askForAPIService;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		return null;
	}
	}
	