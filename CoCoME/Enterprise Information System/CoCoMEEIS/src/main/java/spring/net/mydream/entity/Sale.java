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
			public class Sale implements BaseEntity {
	
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
		
	@Id  // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
				
	
		@ManyToOne(targetEntity=Store.class)
		@JoinColumn(name="belongedstore_id",referencedColumnName="id")
		private Store belongedstore;
				
		public Store getBelongedstore() {
			return belongedstore;
		}
				
		public void setBelongedstore(Store Belongedstore) {
			this.belongedstore = Belongedstore;
		}
				
	
		@ManyToOne(targetEntity=CashDesk.class)
		@JoinColumn(name="belongedcashdesk_id",referencedColumnName="id")
		private CashDesk belongedCashDesk;
				
		public CashDesk getBelongedCashDesk() {
			return belongedCashDesk;
		}
				
		public void setBelongedCashDesk(CashDesk BelongedCashDesk) {
			this.belongedCashDesk = BelongedCashDesk;
		}
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedSale")
				private List<SalesLineItem> containedSalesLine = new ArrayList<SalesLineItem>();
					
		public List<SalesLineItem> getContainedSalesLine() {
			return containedSalesLine;
		}
				
		public void setContainedSalesLine(List<SalesLineItem> ContainedSalesLine) {
			this.containedSalesLine = ContainedSalesLine;
		}
		
				
	
		
		@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "belongedSale")
		private Payment assoicatedPayment;
				
		public Payment getAssoicatedPayment() {
			return assoicatedPayment;
		}
				
		public void setAssoicatedPayment(Payment AssoicatedPayment) {
			this.assoicatedPayment = AssoicatedPayment;
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
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
