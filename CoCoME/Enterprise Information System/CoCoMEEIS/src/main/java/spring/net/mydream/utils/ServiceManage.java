package spring.net.mydream.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.net.mydream.service.*;
@Component
	public class ServiceManage {
	@Autowired
	private CoCoMESystem coCoMESystem;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Autowired
	private ProcessSaleService processSaleService;
	@Autowired
	private ManageStoreCRUDService manageStoreCRUDService;
	@Autowired
	private ManageProductCatalogCRUDService manageProductCatalogCRUDService;
	@Autowired
	private ManageCashDeskCRUDService manageCashDeskCRUDService;
	@Autowired
	private ManageCashierCRUDService manageCashierCRUDService;
	@Autowired
	private ManageItemCRUDService manageItemCRUDService;
	@Autowired
	private ManageSupplierCRUDService manageSupplierCRUDService;
	@Autowired
	private CoCoMEOrderProducts coCoMEOrderProducts;
	public Object getService(String name) {
	if("CoCoMESystem".equals(name)) {
			return coCoMESystem;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("ProcessSaleService".equals(name)) {
			return processSaleService;
		}
		else if("ManageStoreCRUDService".equals(name)) {
			return manageStoreCRUDService;
		}
		else if("ManageProductCatalogCRUDService".equals(name)) {
			return manageProductCatalogCRUDService;
		}
		else if("ManageCashDeskCRUDService".equals(name)) {
			return manageCashDeskCRUDService;
		}
		else if("ManageCashierCRUDService".equals(name)) {
			return manageCashierCRUDService;
		}
		else if("ManageItemCRUDService".equals(name)) {
			return manageItemCRUDService;
		}
		else if("ManageSupplierCRUDService".equals(name)) {
			return manageSupplierCRUDService;
		}
		else if("CoCoMEOrderProducts".equals(name)) {
			return coCoMEOrderProducts;
		}
		return null;
	}
	}
	