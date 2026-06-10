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
			public class Item implements BaseEntity {
	
	/* all primary attributes */
	private int barcode;
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int Barcode) {
		this.barcode = Barcode;
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
		
	@Id  // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
				
	
		@ManyToOne(targetEntity=ProductCatalog.class)
		@JoinColumn(name="belongedcatalog_id",referencedColumnName="id")
		private ProductCatalog belongedCatalog;
				
		public ProductCatalog getBelongedCatalog() {
			return belongedCatalog;
		}
				
		public void setBelongedCatalog(ProductCatalog BelongedCatalog) {
			this.belongedCatalog = BelongedCatalog;
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
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
