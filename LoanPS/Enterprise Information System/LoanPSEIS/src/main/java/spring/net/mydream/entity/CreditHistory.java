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
			public class CreditHistory implements BaseEntity {
	
	/* all primary attributes */
	private double outstandingDebt;
	public double getOutstandingDebt() {
		return outstandingDebt;
	}
	public void setOutstandingDebt(double OutstandingDebt) {
		this.outstandingDebt = OutstandingDebt;
	}	
		
	private int badDebits;
	public int getBadDebits() {
		return badDebits;
	}
	public void setBadDebits(int BadDebits) {
		this.badDebits = BadDebits;
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
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditHistory other = (CreditHistory) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
