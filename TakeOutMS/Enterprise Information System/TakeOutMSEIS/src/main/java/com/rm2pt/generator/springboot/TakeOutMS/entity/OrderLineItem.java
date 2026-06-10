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
	public class OrderLineItem extends BaseEntity {
		
		/* all primary attributes */
		private int quantity;
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int Quantity) {
			this.quantity = Quantity;
		}	
			
		private double subamount;
		public double getSubamount() {
			return subamount;
		}
		public void setSubamount(double Subamount) {
			this.subamount = Subamount;
		}	
			

		
		@ManyToOne(targetEntity=Item.class)
		@JoinColumn(name="orderlineitemtoitem_realid",referencedColumnName="realid")
		private Item orderLineItemtoItem;
				
		public Item getOrderLineItemtoItem() {
			return orderLineItemtoItem;
		}
				
		public void setOrderLineItemtoItem(Item OrderLineItemtoItem) {
			this.orderLineItemtoItem = OrderLineItemtoItem;
		}
		
		@ManyToOne(targetEntity=Sale.class)
		@JoinColumn(name="orderlineitemtosale_realid",referencedColumnName="realid")
		private Sale orderLineItemtoSale;
				
		public Sale getOrderLineItemtoSale() {
			return orderLineItemtoSale;
		}
				
		public void setOrderLineItemtoSale(Sale OrderLineItemtoSale) {
			this.orderLineItemtoSale = OrderLineItemtoSale;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OrderLineItem other = (OrderLineItem) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
