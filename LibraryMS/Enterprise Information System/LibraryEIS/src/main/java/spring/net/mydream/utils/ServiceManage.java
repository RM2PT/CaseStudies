package spring.net.mydream.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.net.mydream.service.*;
@Component
	public class ServiceManage {
	@Autowired
	private LibraryManagementSystemSystem libraryManagementSystemSystem;
	@Autowired
	private ListBookHistory listBookHistory;
	@Autowired
	private SearchBook searchBook;
	@Autowired
	private ManageUserCRUDService manageUserCRUDService;
	@Autowired
	private ManageBookCRUDService manageBookCRUDService;
	@Autowired
	private ManageSubjectCRUDService manageSubjectCRUDService;
	@Autowired
	private ManageBookCopyCRUDService manageBookCopyCRUDService;
	@Autowired
	private ManageLibrarianCRUDService manageLibrarianCRUDService;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	public Object getService(String name) {
	if("LibraryManagementSystemSystem".equals(name)) {
			return libraryManagementSystemSystem;
		}
		else if("ListBookHistory".equals(name)) {
			return listBookHistory;
		}
		else if("SearchBook".equals(name)) {
			return searchBook;
		}
		else if("ManageUserCRUDService".equals(name)) {
			return manageUserCRUDService;
		}
		else if("ManageBookCRUDService".equals(name)) {
			return manageBookCRUDService;
		}
		else if("ManageSubjectCRUDService".equals(name)) {
			return manageSubjectCRUDService;
		}
		else if("ManageBookCopyCRUDService".equals(name)) {
			return manageBookCopyCRUDService;
		}
		else if("ManageLibrarianCRUDService".equals(name)) {
			return manageLibrarianCRUDService;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		return null;
	}
	}
	