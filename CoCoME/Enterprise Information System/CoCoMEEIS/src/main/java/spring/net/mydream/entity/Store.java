package spring.net.mydream.entity;

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
			public class Store implements BaseEntity {
	
	/* all primary attributes */
	@Id  // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedStore")
				private List<CashDesk> associationCashdeskes = new ArrayList<CashDesk>();
					
		public List<CashDesk> getAssociationCashdeskes() {
			return associationCashdeskes;
		}
				
		public void setAssociationCashdeskes(List<CashDesk> AssociationCashdeskes) {
			this.associationCashdeskes = AssociationCashdeskes;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<ProductCatalog> productcatalogs = new ArrayList<ProductCatalog>();
					
		public List<ProductCatalog> getProductcatalogs() {
			return productcatalogs;
		}
				
		public void setProductcatalogs(List<ProductCatalog> Productcatalogs) {
			this.productcatalogs = Productcatalogs;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Item> items = new ArrayList<Item>();
					
		public List<Item> getItems() {
			return items;
		}
				
		public void setItems(List<Item> Items) {
			this.items = Items;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="workedStore")
				private List<Cashier> cashiers = new ArrayList<Cashier>();
					
		public List<Cashier> getCashiers() {
			return cashiers;
		}
				
		public void setCashiers(List<Cashier> Cashiers) {
			this.cashiers = Cashiers;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedstore")
				private List<Sale> sales = new ArrayList<Sale>();
					
		public List<Sale> getSales() {
			return sales;
		}
				
		public void setSales(List<Sale> Sales) {
			this.sales = Sales;
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
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
