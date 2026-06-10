package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private StoreRepository storeRepository;
		public StoreRepository getStoreDao() {
			return storeRepository;
		}
		@Autowired
		private ProductCatalogRepository productCatalogRepository;
		public ProductCatalogRepository getProductCatalogDao() {
			return productCatalogRepository;
		}
		@Autowired
		private CashDeskRepository cashDeskRepository;
		public CashDeskRepository getCashDeskDao() {
			return cashDeskRepository;
		}
		@Autowired
		private SaleRepository saleRepository;
		public SaleRepository getSaleDao() {
			return saleRepository;
		}
		@Autowired
		private CashierRepository cashierRepository;
		public CashierRepository getCashierDao() {
			return cashierRepository;
		}
		@Autowired
		private SalesLineItemRepository salesLineItemRepository;
		public SalesLineItemRepository getSalesLineItemDao() {
			return salesLineItemRepository;
		}
		@Autowired
		private ItemRepository itemRepository;
		public ItemRepository getItemDao() {
			return itemRepository;
		}
		@Autowired
		private PaymentRepository paymentRepository;
		public PaymentRepository getPaymentDao() {
			return paymentRepository;
		}
		@Autowired
		private CashPaymentRepository cashPaymentRepository;
		public CashPaymentRepository getCashPaymentDao() {
			return cashPaymentRepository;
		}
		@Autowired
		private CardPaymentRepository cardPaymentRepository;
		public CardPaymentRepository getCardPaymentDao() {
			return cardPaymentRepository;
		}
		@Autowired
		private OrderEntryRepository orderEntryRepository;
		public OrderEntryRepository getOrderEntryDao() {
			return orderEntryRepository;
		}
		@Autowired
		private SupplierRepository supplierRepository;
		public SupplierRepository getSupplierDao() {
			return supplierRepository;
		}
		@Autowired
		private OrderProductRepository orderProductRepository;
		public OrderProductRepository getOrderProductDao() {
			return orderProductRepository;
		}
	}
	