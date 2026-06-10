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
			public class OrderEntry implements BaseEntity {
	
	/* all primary attributes */
	private int quantity;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int Quantity) {
		this.quantity = Quantity;
	}	
		
	private double subAmount;
	public double getSubAmount() {
		return subAmount;
	}
	public void setSubAmount(double SubAmount) {
		this.subAmount = SubAmount;
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
	
				
	
		@ManyToOne(targetEntity=Item.class)
		@JoinColumn(name="item_id",referencedColumnName="id")
		private Item item;
				
		public Item getItem() {
			return item;
		}
				
		public void setItem(Item Item) {
			this.item = Item;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderEntry other = (OrderEntry) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
