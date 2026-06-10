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
			public class SalesLineItem implements BaseEntity {
	
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
		
	@Id  // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
				
	
		@ManyToOne(targetEntity=Sale.class)
		@JoinColumn(name="belongedsale_id",referencedColumnName="id")
		private Sale belongedSale;
				
		public Sale getBelongedSale() {
			return belongedSale;
		}
				
		public void setBelongedSale(Sale BelongedSale) {
			this.belongedSale = BelongedSale;
		}
				
	
		@ManyToOne(targetEntity=Item.class)
		@JoinColumn(name="belongeditem_id",referencedColumnName="id")
		private Item belongedItem;
				
		public Item getBelongedItem() {
			return belongedItem;
		}
				
		public void setBelongedItem(Item BelongedItem) {
			this.belongedItem = BelongedItem;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesLineItem other = (SalesLineItem) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
