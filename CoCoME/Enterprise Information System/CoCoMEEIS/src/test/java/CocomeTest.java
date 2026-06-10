import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.entity.CashDesk;
import spring.net.mydream.entity.OrderProduct;
import spring.net.mydream.entity.Sale;
import spring.net.mydream.entity.Store;
import spring.net.mydream.redis.CurrentUtils;
import spring.net.mydream.service.*;
import spring.net.mydream.utils.PreconditionException;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

public class CocomeTest {
    @Autowired
    CoCoMEOrderProducts coCoMEOrderProducts;
    @Autowired
    CoCoMESystem coCoMESystem;
    @Autowired
    ManageCashDeskCRUDService manageCashDeskCRUDService;
    @Autowired
    ManageCashierCRUDService manageCashierCRUDService;
    @Autowired
    ManageItemCRUDService manageItemCRUDService;
    @Autowired
    ManageProductCatalogCRUDService manageProductCatalogCRUDService;
    @Autowired
    ManageStoreCRUDService manageStoreCRUDService;
    @Autowired
    ManageSupplierCRUDService manageSupplierCRUDService;
    @Autowired
    ProcessSaleService processSaleService;
    @Autowired
    ThirdPartyServices thirdPartyServices;
    @Autowired
    CurrentUtils currentUtils;

    @Test
    void MakeNewOrderTest() {
        assertDoesNotThrow(()->{
            coCoMEOrderProducts.makeNewOrder(0);
        });
    }

    @Test
    void ListAllOutOfStoreProductsTest() {
        assertDoesNotThrow(()->{
            coCoMEOrderProducts.listAllOutOfStoreProducts();
        });
    }

    @Test
    void OrderItemTest() {
        // the product exists
        assertDoesNotThrow(()->{
            coCoMEOrderProducts.orderItem(0, 10);
        });
        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMEOrderProducts.orderItem(1, 10);
        });
    }

    @Test
    void ChooseSupplierTest() {

        // if there is not a current-order-product
        currentUtils.setAttribute("CurrentOrderProduct", null);

        // the supplier exists
        assertThrows(PreconditionException.class,()->{
            coCoMEOrderProducts.chooseSupplier(0);
        });
        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMEOrderProducts.chooseSupplier(1);
        });

        // if there is a current-order-product
        currentUtils.setAttribute("CurrentOrderProduct", new OrderProduct());

        // the supplier exists
        assertDoesNotThrow(()->{
            coCoMEOrderProducts.chooseSupplier(0);
        });
        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMEOrderProducts.chooseSupplier(1);
        });
    }

    @Test
    void PlaceOrderTest() {

        // if there is not a current-order-product
        currentUtils.setAttribute("CurrentOrderProduct", null);

        assertThrows(PreconditionException.class,()->{
            coCoMEOrderProducts.placeOrder();
        });

        // if there is a current-order-product
        currentUtils.setAttribute("CurrentOrderProduct", new OrderProduct());

        assertDoesNotThrow(()->{
            coCoMEOrderProducts.placeOrder();
        });

    }

    @Test
    void OpenStoreTest() {

        // store exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openStore(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            coCoMESystem.openStore(1);
        });

    }

    @Test
    void CloseStoreTest() {

        // store exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeStore(0);
        });

        // not open
        assertDoesNotThrow(()->{
            coCoMESystem.closeStore(1);
        });

        // not exists
        assertDoesNotThrow(()->{
            coCoMESystem.closeStore(2);
        });

    }

    @Test
    void OpenCashDeskTest() {

        // if there is not a CurrentStore
        currentUtils.setAttribute("CurrentStore", null);
        // if there is not a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", null);

        // CashDesk exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openCashDesk(1);
        });

        // if there is a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", new CashDesk());

        // CashDesk exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openCashDesk(1);
        });

        // if there is not a CurrentStore
        currentUtils.setAttribute("CurrentStore", new Store());
        // if there is not a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", null);

        // CashDesk exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openCashDesk(1);
        });

        // if there is a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", new CashDesk());

        // CashDesk exists
        assertDoesNotThrow(()->{
            coCoMESystem.openCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.openCashDesk(1);
        });

    }

    @Test
    void CloseCashDeskTest() {

        // if there is not a CurrentStore
        currentUtils.setAttribute("CurrentStore", null);
        // if there is not a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", null);

        // CashDesk exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeCashDesk(1);
        });

        // if there is a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", new CashDesk());

        // CashDesk exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeCashDesk(1);
        });

        // if there is not a CurrentStore
        currentUtils.setAttribute("CurrentStore", new Store());
        // if there is not a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", null);

        // CashDesk exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeCashDesk(1);
        });

        // if there is a CurrentCashDesk
        currentUtils.setAttribute("CurrentCashDesk", new CashDesk());

        // CashDesk exists
        assertDoesNotThrow(()->{
            coCoMESystem.closeCashDesk(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.closeCashDesk(1);
        });

    }

    @Test
    void ChangePriceTest() {

        // store exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.changePrice(0, 1);
        });

        // not exists
        assertDoesNotThrow(()->{
            coCoMESystem.changePrice(1, 1);
        });

    }

    @Test
    void ReceiveOrderedProductTest() {

        // op exists
        assertThrows(PreconditionException.class,()->{
            coCoMESystem.receiveOrderedProduct(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            coCoMESystem.receiveOrderedProduct(1);
        });

    }

    @Test
    void ListSuppliersProductTest() {
        assertThrows(PreconditionException.class, () -> {
            coCoMESystem.listSuppliers();
        });
    }

    @Test
    void ShowStockReportsTest() {
        assertThrows(PreconditionException.class, () -> {
            coCoMESystem.showStockReports();
        });
    }

    @Test
    void CreateCashDeskTest() {

        // op exists
        assertThrows(PreconditionException.class,()->{
            manageCashDeskCRUDService.createCashDesk(0, "lemon", false);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageCashDeskCRUDService.createCashDesk(1, "lemon", false);
        });

    }

    @Test
    void QueryCashDeskTest() {

        // op exists
        assertThrows(PreconditionException.class,()->{
            manageCashDeskCRUDService.queryCashDesk(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageCashDeskCRUDService.queryCashDesk(1);
        });

    }

    @Test
    void ModifyCashDeskTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageCashDeskCRUDService.modifyCashDesk(0, "lemon", false);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageCashDeskCRUDService.modifyCashDesk(1, "lemon", false);
        });
    }

    @Test
    void DeleteCashDeskTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageCashDeskCRUDService.deleteCashDesk(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageCashDeskCRUDService.deleteCashDesk(1);
        });
    }

    @Test
    void CreateCashierTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageCashierCRUDService.createCashier(0, "lemon");
        });

        // not exists
        assertDoesNotThrow(()->{
            manageCashierCRUDService.createCashier(1, "lemon");
        });
    }

    @Test
    void QueryCashierTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageCashierCRUDService.queryCashier(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageCashierCRUDService.queryCashier(1);
        });
    }

    @Test
    void ModifyCashierTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageCashierCRUDService.modifyCashier(0, "lemon");
        });

        // not exists
        assertDoesNotThrow(()->{
            manageCashierCRUDService.modifyCashier(1, "lemon");
        });
    }

    @Test
    void DeleteCashierTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageCashierCRUDService.deleteCashier(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageCashierCRUDService.deleteCashier(1);
        });
    }

    @Test
    void CreateItemTest() {
        // not exists
        assertDoesNotThrow(()->{
            manageItemCRUDService.createItem(0, "lemon", 10, 10, 10);
        });

        // exists
        assertThrows(PreconditionException.class,()->{
            manageItemCRUDService.createItem(1, "lemon", 10, 10, 10);
        });
    }

    @Test
    void QueryItemTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageItemCRUDService.queryItem(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageItemCRUDService.queryItem(1);
        });
    }

    @Test
    void ModifyItemTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageItemCRUDService.modifyItem(0, "lemon", 10, 10, 10);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageItemCRUDService.modifyItem(1, "lemon", 10, 10, 10);
        });
    }

    @Test
    void DeleteItemTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageItemCRUDService.deleteItem(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageItemCRUDService.deleteItem(1);
        });
    }

    @Test
    void CreateProductCatalogTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageProductCatalogCRUDService.createProductCatalog(0, "lemon");
        });

        // not exists
        assertDoesNotThrow(()->{
            manageProductCatalogCRUDService.createProductCatalog(0, "lemon");
        });
    }

    @Test
    void QueryProductCatalogTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageProductCatalogCRUDService.queryProductCatalog(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageProductCatalogCRUDService.queryProductCatalog(1);
        });
    }

    @Test
    void ModifyProductCatalogTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageProductCatalogCRUDService.modifyProductCatalog(0, "lemon");
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageProductCatalogCRUDService.modifyProductCatalog(1, "lemon");
        });
    }

    @Test
    void DeleteProductCatalogTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageProductCatalogCRUDService.deleteProductCatalog(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageProductCatalogCRUDService.deleteProductCatalog(1);
        });
    }

    @Test
    void CreateStoreTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageStoreCRUDService.createStore(0, "lemon", "forest", false);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageStoreCRUDService.createStore(1, "lemon", "forest", false);
        });
    }

    @Test
    void QueryStoreTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageStoreCRUDService.queryStore(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageStoreCRUDService.queryStore(1);
        });
    }

    @Test
    void ModifyStoreTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageStoreCRUDService.modifyStore(0, "lemon", "forest", false);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageStoreCRUDService.modifyStore(1, "lemon", "forest", false);
        });
    }

    @Test
    void DeleteStoreTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageStoreCRUDService.deleteStore(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageStoreCRUDService.deleteStore(1);
        });
    }

    @Test
    void CreateSupplierTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageSupplierCRUDService.createSupplier(0, "lemon");
        });

        // not exists
        assertDoesNotThrow(()->{
            manageSupplierCRUDService.createSupplier(1, "lemon");
        });
    }

    @Test
    void QuerySupplierTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageSupplierCRUDService.querySupplier(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageSupplierCRUDService.querySupplier(1);
        });
    }

    @Test
    void ModifySupplierTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageSupplierCRUDService.modifySupplier(0, "lemon");
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageSupplierCRUDService.modifySupplier(1, "lemon");
        });
    }

    @Test
    void DeleteSupplierTest() {
        // op exists
        assertDoesNotThrow(()->{
            manageSupplierCRUDService.deleteSupplier(0);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            manageSupplierCRUDService.deleteSupplier(1);
        });
    }

    @Test
    void MakeNewSaleTest() {
        // if null
        currentUtils.setAttribute("CurrentCashDesk", null);
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeNewSale();
        });

        // if not null
        currentUtils.setAttribute("CurrentCashDesk", new Store());
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeNewSale();
        });

        // if null
        currentUtils.setAttribute("CurrentCashDesk", null);
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeNewSale();
        });

        // if not null
        currentUtils.setAttribute("CurrentCashDesk", new Store());
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertDoesNotThrow(()->{
            processSaleService.makeNewSale();
        });
    }

    @Test
    void EnterItemTest() {
        // if null
        currentUtils.setAttribute("CurrentSaleLine", null);
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.enterItem(0, 1);
        });
        assertThrows(PreconditionException.class,()->{
            processSaleService.enterItem(1, 1);
        });

        // if not null
        currentUtils.setAttribute("CurrentSaleLine", new Store());
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.enterItem(0, 1);
        });
        assertThrows(PreconditionException.class,()->{
            processSaleService.enterItem(1, 1);
        });

        // if null
        currentUtils.setAttribute("CurrentSaleLine", null);
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertThrows(PreconditionException.class,()->{
            processSaleService.enterItem(0, 1);
        });
        assertThrows(PreconditionException.class,()->{
            processSaleService.enterItem(1, 1);
        });

        // if not null
        currentUtils.setAttribute("CurrentSaleLine", new Store());
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertDoesNotThrow(()->{
            processSaleService.enterItem(0, 1);
        });
        assertThrows(PreconditionException.class,()->{
            processSaleService.enterItem(1, 1);
        });
    }

    @Test
    void EndSaleTest() {
        // if null
        currentUtils.setAttribute("CurrentSale", null);

        var t = new Sale();
        t.setIsComplete(false);
        t.setIsReadytoPay(false);
        assertThrows(PreconditionException.class,()->{
            processSaleService.endSale();
        });


        // if not null
        currentUtils.setAttribute("CurrentSale", t);
        assertDoesNotThrow(()->{
            processSaleService.endSale();
        });

        t.setIsComplete(true);
        currentUtils.setAttribute("CurrentSale", t);
        assertThrows(PreconditionException.class,()->{
            processSaleService.endSale();
        });

        t.setIsComplete(false);
        t.setIsReadytoPay(true);
        currentUtils.setAttribute("CurrentSale", t);
        assertThrows(PreconditionException.class,()->{
            processSaleService.endSale();
        });

        t.setIsComplete(true);
        currentUtils.setAttribute("CurrentSale", t);
        assertThrows(PreconditionException.class,()->{
            processSaleService.endSale();
        });
    }

    @Test
    void MakeCashPaymentTest() {
        // if null
        currentUtils.setAttribute("CurrentStore", null);
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeCashPayment(10);
        });

        // if not null
        currentUtils.setAttribute("CurrentStore", new Store());
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeCashPayment(10);
        });

        // if null
        currentUtils.setAttribute("CurrentStore", null);
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeCashPayment(10);
        });

        // if not null
        currentUtils.setAttribute("CurrentStore", new Store());
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertDoesNotThrow(()->{
            processSaleService.makeCashPayment(10);
        });
    }

    @Test
    void MakeCardPaymentTest() {
        // if null
        currentUtils.setAttribute("CurrentStore", null);
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeCardPayment("114514", new Date(1919810), 20);
        });


        // if not null
        currentUtils.setAttribute("CurrentStore", new Store());
        // if null
        currentUtils.setAttribute("CurrentSale", null);
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeCardPayment("114514", new Date(1919810), 20);
        });


        // if null
        currentUtils.setAttribute("CurrentStore", null);
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertThrows(PreconditionException.class,()->{
            processSaleService.makeCardPayment("114514", new Date(1919810), 20);
        });

        // if not null
        currentUtils.setAttribute("CurrentStore", new Store());
        // if not null
        currentUtils.setAttribute("CurrentSale", new Sale());
        assertDoesNotThrow(()->{
            processSaleService.makeCardPayment("114514", new Date(1919810), 20);
        });
    }

}
