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
			public class Loan implements BaseEntity {
	
	/* all primary attributes */
	private Date loanDate;
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date LoanDate) {
		this.loanDate = LoanDate;
	}	
		
	private Date renewDate;
	public Date getRenewDate() {
		return renewDate;
	}
	public void setRenewDate(Date RenewDate) {
		this.renewDate = RenewDate;
	}	
		
	private Date dueDate;
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date DueDate) {
		this.dueDate = DueDate;
	}	
		
	private Date returnDate;
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date ReturnDate) {
		this.returnDate = ReturnDate;
	}	
		
	private int renewedTimes;
	public int getRenewedTimes() {
		return renewedTimes;
	}
	public void setRenewedTimes(int RenewedTimes) {
		this.renewedTimes = RenewedTimes;
	}	
		
	private Boolean isReturned;
	public Boolean getIsReturned() {
		return isReturned;
	}
	public void setIsReturned(Boolean IsReturned) {
		this.isReturned = IsReturned;
	}	
		
	private double overDueFee;
	public double getOverDueFee() {
		return overDueFee;
	}
	public void setOverDueFee(double OverDueFee) {
		this.overDueFee = OverDueFee;
	}	
		
	private Boolean overDue3Days;
	public Boolean getOverDue3Days() {
		return overDue3Days;
	}
	public void setOverDue3Days(Boolean OverDue3Days) {
		this.overDue3Days = OverDue3Days;
	}	
		
	private Boolean overDue10Days;
	public Boolean getOverDue10Days() {
		return overDue10Days;
	}
	public void setOverDue10Days(Boolean OverDue10Days) {
		this.overDue10Days = OverDue10Days;
	}	
		
	private Boolean overDue17Days;
	public Boolean getOverDue17Days() {
		return overDue17Days;
	}
	public void setOverDue17Days(Boolean OverDue17Days) {
		this.overDue17Days = OverDue17Days;
	}	
		
	private Boolean overDue31Days;
	public Boolean getOverDue31Days() {
		return overDue31Days;
	}
	public void setOverDue31Days(Boolean OverDue31Days) {
		this.overDue31Days = OverDue31Days;
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
		@JoinColumn(name="loaneduser_id",referencedColumnName="id")
		private User loanedUser;
				
		public User getLoanedUser() {
			return loanedUser;
		}
				
		public void setLoanedUser(User LoanedUser) {
			this.loanedUser = LoanedUser;
		}
				
	
		@ManyToOne(targetEntity=BookCopy.class)
		@JoinColumn(name="loanedcopy_id",referencedColumnName="id")
		private BookCopy loanedCopy;
				
		public BookCopy getLoanedCopy() {
			return loanedCopy;
		}
				
		public void setLoanedCopy(BookCopy LoanedCopy) {
			this.loanedCopy = LoanedCopy;
		}
				
	
		@ManyToOne(targetEntity=Librarian.class)
		@JoinColumn(name="loanlibrarian_id",referencedColumnName="id")
		private Librarian loanLibrarian;
				
		public Librarian getLoanLibrarian() {
			return loanLibrarian;
		}
				
		public void setLoanLibrarian(Librarian LoanLibrarian) {
			this.loanLibrarian = LoanLibrarian;
		}
				
	
		@ManyToOne(targetEntity=Librarian.class)
		@JoinColumn(name="returnlibrarian_id",referencedColumnName="id")
		private Librarian returnLibrarian;
				
		public Librarian getReturnLibrarian() {
			return returnLibrarian;
		}
				
		public void setReturnLibrarian(Librarian ReturnLibrarian) {
			this.returnLibrarian = ReturnLibrarian;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
