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
	public class Store extends BaseEntity {
		
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
			
		private String address;
		public String getAddress() {
			return address;
		}
		public void setAddress(String Address) {
			this.address = Address;
		}	
			
		private Boolean isOpened;
		public Boolean getIsOpened() {
			return isOpened;
		}
		public void setIsOpened(Boolean IsOpened) {
			this.isOpened = IsOpened;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="saletoStore")
				private List<Sale> storetoSale = new ArrayList<Sale>();
					
		public List<Sale> getStoretoSale() {
			return storetoSale;
		}
				
		public void setStoretoSale(List<Sale> StoretoSale) {
			this.storetoSale = StoretoSale;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="itemtoStore")
				private List<Item> storetoItem = new ArrayList<Item>();
					
		public List<Item> getStoretoItem() {
			return storetoItem;
		}
				
		public void setStoretoItem(List<Item> StoretoItem) {
			this.storetoItem = StoretoItem;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<ProductCatalog> storetoProductCatalog = new ArrayList<ProductCatalog>();
					
		public List<ProductCatalog> getStoretoProductCatalog() {
			return storetoProductCatalog;
		}
				
		public void setStoretoProductCatalog(List<ProductCatalog> StoretoProductCatalog) {
			this.storetoProductCatalog = StoretoProductCatalog;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Store other = (Store) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
