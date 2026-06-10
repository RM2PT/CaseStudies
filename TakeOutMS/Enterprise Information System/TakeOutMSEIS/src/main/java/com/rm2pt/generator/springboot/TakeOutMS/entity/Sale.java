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
	public class Sale extends BaseEntity {
		
		/* all primary attributes */
		private Date time;
		public Date getTime() {
			return time;
		}
		public void setTime(Date Time) {
			this.time = Time;
		}	
			
		private Boolean isComplete;
		public Boolean getIsComplete() {
			return isComplete;
		}
		public void setIsComplete(Boolean IsComplete) {
			this.isComplete = IsComplete;
		}	
			
		private double amount;
		public double getAmount() {
			return amount;
		}
		public void setAmount(double Amount) {
			this.amount = Amount;
		}	
			
		private Boolean isReadytoPay;
		public Boolean getIsReadytoPay() {
			return isReadytoPay;
		}
		public void setIsReadytoPay(Boolean IsReadytoPay) {
			this.isReadytoPay = IsReadytoPay;
		}	
			
		private Boolean isAccept;
		public Boolean getIsAccept() {
			return isAccept;
		}
		public void setIsAccept(Boolean IsAccept) {
			this.isAccept = IsAccept;
		}	
			
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String Name) {
			this.name = Name;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="orderLineItemtoSale")
				private List<OrderLineItem> saletoOrderLineItem = new ArrayList<OrderLineItem>();
					
		public List<OrderLineItem> getSaletoOrderLineItem() {
			return saletoOrderLineItem;
		}
				
		public void setSaletoOrderLineItem(List<OrderLineItem> SaletoOrderLineItem) {
			this.saletoOrderLineItem = SaletoOrderLineItem;
		}
		
		
		@JsonIgnore	
		@OneToOne(cascade = CascadeType.REFRESH)
		@JoinColumn(name = "saleto_payment_realid")
		private Payment saletoPayment;
				
		public Payment getSaletoPayment() {
			return saletoPayment;
		}
				
		public void setSaletoPayment(Payment SaletoPayment) {
			this.saletoPayment = SaletoPayment;
		}
		
		@ManyToOne(targetEntity=Store.class)
		@JoinColumn(name="saletostore_realid",referencedColumnName="realid")
		private Store saletoStore;
				
		public Store getSaletoStore() {
			return saletoStore;
		}
				
		public void setSaletoStore(Store SaletoStore) {
			this.saletoStore = SaletoStore;
		}
		
		@ManyToOne(targetEntity=Cutomer.class)
		@JoinColumn(name="saletocutomer_realid",referencedColumnName="realid")
		private Cutomer saletoCutomer;
				
		public Cutomer getSaletoCutomer() {
			return saletoCutomer;
		}
				
		public void setSaletoCutomer(Cutomer SaletoCutomer) {
			this.saletoCutomer = SaletoCutomer;
		}
		
		@ManyToOne(targetEntity=Dilivery.class)
		@JoinColumn(name="saletodilivery_realid",referencedColumnName="realid")
		private Dilivery saletoDilivery;
				
		public Dilivery getSaletoDilivery() {
			return saletoDilivery;
		}
				
		public void setSaletoDilivery(Dilivery SaletoDilivery) {
			this.saletoDilivery = SaletoDilivery;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Sale other = (Sale) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
