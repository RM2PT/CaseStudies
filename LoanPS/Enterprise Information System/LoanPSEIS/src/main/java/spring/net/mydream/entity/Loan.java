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
	private int loanID;
	public int getLoanID() {
		return loanID;
	}
	public void setLoanID(int LoanID) {
		this.loanID = LoanID;
	}	
		
	private double remainAmountToPay;
	public double getRemainAmountToPay() {
		return remainAmountToPay;
	}
	public void setRemainAmountToPay(double RemainAmountToPay) {
		this.remainAmountToPay = RemainAmountToPay;
	}	
		
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer Status) {
		this.status = Status;
	}	
		
	private Boolean isPaidinFull;
	public Boolean getIsPaidinFull() {
		return isPaidinFull;
	}
	public void setIsPaidinFull(Boolean IsPaidinFull) {
		this.isPaidinFull = IsPaidinFull;
	}	
		
	private Date startDate;
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date StartDate) {
		this.startDate = StartDate;
	}	
		
	private Date endDate;
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date EndDate) {
		this.endDate = EndDate;
	}	
		
	private Date currentOverDueDate;
	public Date getCurrentOverDueDate() {
		return currentOverDueDate;
	}
	public void setCurrentOverDueDate(Date CurrentOverDueDate) {
		this.currentOverDueDate = CurrentOverDueDate;
	}	
		
	private int rePaymentDays;
	public int getRePaymentDays() {
		return rePaymentDays;
	}
	public void setRePaymentDays(int RePaymentDays) {
		this.rePaymentDays = RePaymentDays;
	}	
		
	private double repaymentAmount;
	public double getRepaymentAmount() {
		return repaymentAmount;
	}
	public void setRepaymentAmount(double RepaymentAmount) {
		this.repaymentAmount = RepaymentAmount;
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
		@OneToOne(cascade = CascadeType.REFRESH)
		@JoinColumn(name = "refered_loan_request_id")
		private LoanRequest referedLoanRequest;
				
		public LoanRequest getReferedLoanRequest() {
			return referedLoanRequest;
		}
				
		public void setReferedLoanRequest(LoanRequest ReferedLoanRequest) {
			this.referedLoanRequest = ReferedLoanRequest;
		}
				
	
		@ManyToOne(targetEntity=LoanAccount.class)
		@JoinColumn(name="belongedloanaccount_id",referencedColumnName="id")
		private LoanAccount belongedLoanAccount;
				
		public LoanAccount getBelongedLoanAccount() {
			return belongedLoanAccount;
		}
				
		public void setBelongedLoanAccount(LoanAccount BelongedLoanAccount) {
			this.belongedLoanAccount = BelongedLoanAccount;
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
