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
			public class Reserve implements BaseEntity {
	
	/* all primary attributes */
	private Date reserveDate;
	public Date getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(Date ReserveDate) {
		this.reserveDate = ReserveDate;
	}	
		
	private Boolean isReserveClosed;
	public Boolean getIsReserveClosed() {
		return isReserveClosed;
	}
	public void setIsReserveClosed(Boolean IsReserveClosed) {
		this.isReserveClosed = IsReserveClosed;
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
	
				
	
		@ManyToOne(targetEntity=BookCopy.class)
		@JoinColumn(name="reservedcopy_id",referencedColumnName="id")
		private BookCopy reservedCopy;
				
		public BookCopy getReservedCopy() {
			return reservedCopy;
		}
				
		public void setReservedCopy(BookCopy ReservedCopy) {
			this.reservedCopy = ReservedCopy;
		}
				
	
		@ManyToOne(targetEntity=User.class)
		@JoinColumn(name="reserveduser_id",referencedColumnName="id")
		private User reservedUser;
				
		public User getReservedUser() {
			return reservedUser;
		}
				
		public void setReservedUser(User ReservedUser) {
			this.reservedUser = ReservedUser;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserve other = (Reserve) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
