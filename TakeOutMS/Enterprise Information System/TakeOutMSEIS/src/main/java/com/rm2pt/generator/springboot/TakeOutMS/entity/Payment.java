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
	public class Payment extends BaseEntity {
		
		/* all primary attributes */
		private double amountTendered;
		public double getAmountTendered() {
			return amountTendered;
		}
		public void setAmountTendered(double AmountTendered) {
			this.amountTendered = AmountTendered;
		}	
			

		
		
		@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "saletoPayment")
		private Sale paymenttoSale;
				
		public Sale getPaymenttoSale() {
			return paymenttoSale;
		}
				
		public void setPaymenttoSale(Sale PaymenttoSale) {
			this.paymenttoSale = PaymenttoSale;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Payment other = (Payment) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
