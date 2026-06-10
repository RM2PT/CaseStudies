package com.rm2pt.generator.springboot.TakeOutMS.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import com.rm2pt.generator.springboot.TakeOutMS.dao.*;
	import com.rm2pt.generator.springboot.TakeOutMS.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private ItemRepository itemRepository;
		public ItemRepository getItemDao() {
			return itemRepository;
		}
		@Autowired
		private OrderLineItemRepository orderLineItemRepository;
		public OrderLineItemRepository getOrderLineItemDao() {
			return orderLineItemRepository;
		}
		@Autowired
		private SaleRepository saleRepository;
		public SaleRepository getSaleDao() {
			return saleRepository;
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
		private CutomerRepository cutomerRepository;
		public CutomerRepository getCutomerDao() {
			return cutomerRepository;
		}
		@Autowired
		private DiliveryRepository diliveryRepository;
		public DiliveryRepository getDiliveryDao() {
			return diliveryRepository;
		}
	}
	