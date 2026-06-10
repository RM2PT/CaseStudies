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
			public class User implements BaseEntity {
	
	/* all primary attributes */
	private String userID;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String UserID) {
		this.userID = UserID;
	}	
		
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}	
		
	private Integer sex;
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer Sex) {
		this.sex = Sex;
	}	
		
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String Password) {
		this.password = Password;
	}	
		
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}	
		
	private String faculty;
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String Faculty) {
		this.faculty = Faculty;
	}	
		
	private int loanedNumber;
	public int getLoanedNumber() {
		return loanedNumber;
	}
	public void setLoanedNumber(int LoanedNumber) {
		this.loanedNumber = LoanedNumber;
	}	
		
	private Integer borrowStatus;
	public Integer getBorrowStatus() {
		return borrowStatus;
	}
	public void setBorrowStatus(Integer BorrowStatus) {
		this.borrowStatus = BorrowStatus;
	}	
		
	private int suspensionDays;
	public int getSuspensionDays() {
		return suspensionDays;
	}
	public void setSuspensionDays(int SuspensionDays) {
		this.suspensionDays = SuspensionDays;
	}	
		
	private double overDueFee;
	public double getOverDueFee() {
		return overDueFee;
	}
	public void setOverDueFee(double OverDueFee) {
		this.overDueFee = OverDueFee;
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
	
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="loanedUser")
				private List<Loan> loanedBook = new ArrayList<Loan>();
					
		public List<Loan> getLoanedBook() {
			return loanedBook;
		}
				
		public void setLoanedBook(List<Loan> LoanedBook) {
			this.loanedBook = LoanedBook;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="reservedUser")
				private List<Reserve> reservedBook = new ArrayList<Reserve>();
					
		public List<Reserve> getReservedBook() {
			return reservedBook;
		}
				
		public void setReservedBook(List<Reserve> ReservedBook) {
			this.reservedBook = ReservedBook;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="recommendUser")
				private List<RecommendBook> recommendedBook = new ArrayList<RecommendBook>();
					
		public List<RecommendBook> getRecommendedBook() {
			return recommendedBook;
		}
				
		public void setRecommendedBook(List<RecommendBook> RecommendedBook) {
			this.recommendedBook = RecommendedBook;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
