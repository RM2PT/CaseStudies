package spring.net.mydream.controller;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/main")
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/openStore")
	public String openStore() {
		return "views/openStore";
	}
	@RequestMapping("/closeStore")
	public String closeStore() {
		return "views/closeStore";
	}
	@RequestMapping("/openCashDesk")
	public String openCashDesk() {
		return "views/openCashDesk";
	}
	@RequestMapping("/closeCashDesk")
	public String closeCashDesk() {
		return "views/closeCashDesk";
	}
	@RequestMapping("/makeNewSale")
	public String makeNewSale() {
		return "views/makeNewSale";
	}
	@RequestMapping("/enterItem")
	public String enterItem() {
		return "views/enterItem";
	}
	@RequestMapping("/endSale")
	public String endSale() {
		return "views/endSale";
	}
	@RequestMapping("/makeCashPayment")
	public String makeCashPayment() {
		return "views/makeCashPayment";
	}
	@RequestMapping("/makeCardPayment")
	public String makeCardPayment() {
		return "views/makeCardPayment";
	}
	@RequestMapping("/thirdPartyCardPaymentService")
	public String thirdPartyCardPaymentService() {
		return "views/thirdPartyCardPaymentService";
	}
	@RequestMapping("/makeNewOrder")
	public String makeNewOrder() {
		return "views/makeNewOrder";
	}
	@RequestMapping("/listAllOutOfStoreProducts")
	public String listAllOutOfStoreProducts() {
		return "views/listAllOutOfStoreProducts";
	}
	@RequestMapping("/orderItem")
	public String orderItem() {
		return "views/orderItem";
	}
	@RequestMapping("/chooseSupplier")
	public String chooseSupplier() {
		return "views/chooseSupplier";
	}
	@RequestMapping("/placeOrder")
	public String placeOrder() {
		return "views/placeOrder";
	}
	@RequestMapping("/changePrice")
	public String changePrice() {
		return "views/changePrice";
	}
	@RequestMapping("/receiveOrderedProduct")
	public String receiveOrderedProduct() {
		return "views/receiveOrderedProduct";
	}
	@RequestMapping("/listSuppliers")
	public String listSuppliers() {
		return "views/listSuppliers";
	}
	@RequestMapping("/showStockReports")
	public String showStockReports() {
		return "views/showStockReports";
	}
	@RequestMapping("/createStore")
	public String createStore() {
		return "views/createStore";
	}
	@RequestMapping("/queryStore")
	public String queryStore() {
		return "views/queryStore";
	}
	@RequestMapping("/modifyStore")
	public String modifyStore() {
		return "views/modifyStore";
	}
	@RequestMapping("/deleteStore")
	public String deleteStore() {
		return "views/deleteStore";
	}
	@RequestMapping("/createProductCatalog")
	public String createProductCatalog() {
		return "views/createProductCatalog";
	}
	@RequestMapping("/queryProductCatalog")
	public String queryProductCatalog() {
		return "views/queryProductCatalog";
	}
	@RequestMapping("/modifyProductCatalog")
	public String modifyProductCatalog() {
		return "views/modifyProductCatalog";
	}
	@RequestMapping("/deleteProductCatalog")
	public String deleteProductCatalog() {
		return "views/deleteProductCatalog";
	}
	@RequestMapping("/createCashDesk")
	public String createCashDesk() {
		return "views/createCashDesk";
	}
	@RequestMapping("/queryCashDesk")
	public String queryCashDesk() {
		return "views/queryCashDesk";
	}
	@RequestMapping("/modifyCashDesk")
	public String modifyCashDesk() {
		return "views/modifyCashDesk";
	}
	@RequestMapping("/deleteCashDesk")
	public String deleteCashDesk() {
		return "views/deleteCashDesk";
	}
	@RequestMapping("/createCashier")
	public String createCashier() {
		return "views/createCashier";
	}
	@RequestMapping("/queryCashier")
	public String queryCashier() {
		return "views/queryCashier";
	}
	@RequestMapping("/modifyCashier")
	public String modifyCashier() {
		return "views/modifyCashier";
	}
	@RequestMapping("/deleteCashier")
	public String deleteCashier() {
		return "views/deleteCashier";
	}
	@RequestMapping("/createItem")
	public String createItem() {
		return "views/createItem";
	}
	@RequestMapping("/queryItem")
	public String queryItem() {
		return "views/queryItem";
	}
	@RequestMapping("/modifyItem")
	public String modifyItem() {
		return "views/modifyItem";
	}
	@RequestMapping("/deleteItem")
	public String deleteItem() {
		return "views/deleteItem";
	}
	@RequestMapping("/createSupplier")
	public String createSupplier() {
		return "views/createSupplier";
	}
	@RequestMapping("/querySupplier")
	public String querySupplier() {
		return "views/querySupplier";
	}
	@RequestMapping("/modifySupplier")
	public String modifySupplier() {
		return "views/modifySupplier";
	}
	@RequestMapping("/deleteSupplier")
	public String deleteSupplier() {
		return "views/deleteSupplier";
	}
	}