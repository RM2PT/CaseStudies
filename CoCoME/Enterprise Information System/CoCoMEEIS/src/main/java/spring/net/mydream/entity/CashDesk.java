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
			public class CashDesk implements BaseEntity {
	
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
		
	private Boolean isOpened;
	public Boolean getIsOpened() {
		return isOpened;
	}
	public void setIsOpened(Boolean IsOpened) {
		this.isOpened = IsOpened;
	}	
		
	
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedCashDesk")
				private List<Sale> containedSales = new ArrayList<Sale>();
					
		public List<Sale> getContainedSales() {
			return containedSales;
		}
				
		public void setContainedSales(List<Sale> ContainedSales) {
			this.containedSales = ContainedSales;
		}
		
				
	
		@ManyToOne(targetEntity=Store.class)
		@JoinColumn(name="belongedstore_id",referencedColumnName="id")
		private Store belongedStore;
				
		public Store getBelongedStore() {
			return belongedStore;
		}
				
		public void setBelongedStore(Store BelongedStore) {
			this.belongedStore = BelongedStore;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CashDesk other = (CashDesk) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
