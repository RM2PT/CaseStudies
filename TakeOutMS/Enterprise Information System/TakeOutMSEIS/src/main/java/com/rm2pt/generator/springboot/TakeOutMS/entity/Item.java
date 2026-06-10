	package com.rm2pt.generator.springboot.TakeOutMS.entity;
	
	import org.hibernate.annotations.Fetch;
	import org.hibernate.annotations.FetchMode;
	import com.fasterxml.jackson.annotation.JsonBackReference;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import javax.persistence.FetchType;
	import java.util.ArrayList;
	import javax.persistence.OneToMany;
	import javax.persistence.OneToOne;
	import javax.persistence.CascadeType;
	import java.util.Date;
	import java.util.List;
	import java.io.Serializable;
	import javax.persistence.Entity;
	import javax.persistence.Transient;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import com.fasterxml.jackson.annotation.ObjectIdGenerators;
	import com.fasterxml.jackson.annotation.JsonIdentityInfo;
	
	@Entity
	public class Item extends BaseEntity {
		
		/* all primary attributes */
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int Id) {
			this.id = Id;
		}	
			
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String Name) {
			this.name = Name;
		}	
			
		private double price;
		public double getPrice() {
			return price;
		}
		public void setPrice(double Price) {
			this.price = Price;
		}	
			
		private int stockNumber;
		public int getStockNumber() {
			return stockNumber;
		}
		public void setStockNumber(int StockNumber) {
			this.stockNumber = StockNumber;
		}	
			
		private double orderPrice;
		public double getOrderPrice() {
			return orderPrice;
		}
		public void setOrderPrice(double OrderPrice) {
			this.orderPrice = OrderPrice;
		}	
			

		
		@ManyToOne(targetEntity=ProductCatalog.class)
		@JoinColumn(name="itemtoproductcatalog_realid",referencedColumnName="realid")
		private ProductCatalog itemtoProductCatalog;
				
		public ProductCatalog getItemtoProductCatalog() {
			return itemtoProductCatalog;
		}
				
		public void setItemtoProductCatalog(ProductCatalog ItemtoProductCatalog) {
			this.itemtoProductCatalog = ItemtoProductCatalog;
		}
		
		@ManyToOne(targetEntity=Store.class)
		@JoinColumn(name="itemtostore_realid",referencedColumnName="realid")
		private Store itemtoStore;
				
		public Store getItemtoStore() {
			return itemtoStore;
		}
				
		public void setItemtoStore(Store ItemtoStore) {
			this.itemtoStore = ItemtoStore;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
