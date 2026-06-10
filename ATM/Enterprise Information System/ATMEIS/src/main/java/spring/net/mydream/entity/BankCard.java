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
			public class BankCard implements BaseEntity {
	
	/* all primary attributes */
	private int cardID;
	public int getCardID() {
		return cardID;
	}
	public void setCardID(int CardID) {
		this.cardID = CardID;
	}	
		
	private Integer cardStatus;
	public Integer getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(Integer CardStatus) {
		this.cardStatus = CardStatus;
	}	
		
	private Integer catalog;
	public Integer getCatalog() {
		return catalog;
	}
	public void setCatalog(Integer Catalog) {
		this.catalog = Catalog;
	}	
		
	private int password;
	public int getPassword() {
		return password;
	}
	public void setPassword(int Password) {
		this.password = Password;
	}	
		
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double Balance) {
		this.balance = Balance;
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
	
				
	
		@ManyToOne(targetEntity=User.class)
		@JoinColumn(name="belongeduser_id",referencedColumnName="id")
		private User belongedUser;
				
		public User getBelongedUser() {
			return belongedUser;
		}
				
		public void setBelongedUser(User BelongedUser) {
			this.belongedUser = BelongedUser;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankCard other = (BankCard) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
