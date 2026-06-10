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
			public class OrderProduct implements BaseEntity {
	
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
	private Date time;
	public Date getTime() {
		return time;
	}
	public void setTime(Date Time) {
		this.time = Time;
	}	
		
	private Integer orderStatus;
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer OrderStatus) {
		this.orderStatus = OrderStatus;
	}	
		
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double Amount) {
		this.amount = Amount;
	}	
		
	
				
	
		@ManyToOne(targetEntity=Supplier.class)
		@JoinColumn(name="supplier_id",referencedColumnName="id")
		private Supplier supplier;
				
		public Supplier getSupplier() {
			return supplier;
		}
				
		public void setSupplier(Supplier Supplier) {
			this.supplier = Supplier;
		}
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<OrderEntry> containedEntries = new ArrayList<OrderEntry>();
					
		public List<OrderEntry> getContainedEntries() {
			return containedEntries;
		}
				
		public void setContainedEntries(List<OrderEntry> ContainedEntries) {
			this.containedEntries = ContainedEntries;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderProduct other = (OrderProduct) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
