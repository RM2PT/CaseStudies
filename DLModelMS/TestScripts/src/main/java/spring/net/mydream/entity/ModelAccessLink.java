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
			public class ModelAccessLink implements BaseEntity {
	
	/* all primary attributes */
	private String symbol;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String Symbol) {
		this.symbol = Symbol;
	}	
		
	private int currentVisitNumber;
	public int getCurrentVisitNumber() {
		return currentVisitNumber;
	}
	public void setCurrentVisitNumber(int CurrentVisitNumber) {
		this.currentVisitNumber = CurrentVisitNumber;
	}	
		
	private int maximumVisitNumber;
	public int getMaximumVisitNumber() {
		return maximumVisitNumber;
	}
	public void setMaximumVisitNumber(int MaximumVisitNumber) {
		this.maximumVisitNumber = MaximumVisitNumber;
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
	
				
	
		@ManyToOne(targetEntity=Model.class)
		@JoinColumn(name="belongedmodel_id",referencedColumnName="id")
		private Model belongedModel;
				
		public Model getBelongedModel() {
			return belongedModel;
		}
				
		public void setBelongedModel(Model BelongedModel) {
			this.belongedModel = BelongedModel;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelAccessLink other = (ModelAccessLink) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
