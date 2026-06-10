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
			public class LoanRequest implements BaseEntity {
	
	/* all primary attributes */
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer Status) {
		this.status = Status;
	}	
		
	private int requestID;
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int RequestID) {
		this.requestID = RequestID;
	}	
		
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}	
		
	private double loanAmount;
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double LoanAmount) {
		this.loanAmount = LoanAmount;
	}	
		
	private String loanPurpose;
	public String getLoanPurpose() {
		return loanPurpose;
	}
	public void setLoanPurpose(String LoanPurpose) {
		this.loanPurpose = LoanPurpose;
	}	
		
	private double income;
	public double getIncome() {
		return income;
	}
	public void setIncome(double Income) {
		this.income = Income;
	}	
		
	private int phoneNumber;
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int PhoneNumber) {
		this.phoneNumber = PhoneNumber;
	}	
		
	private String postalAddress;
	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String PostalAddress) {
		this.postalAddress = PostalAddress;
	}	
		
	private int zipCode;
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int ZipCode) {
		this.zipCode = ZipCode;
	}	
		
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}	
		
	private String workReferences;
	public String getWorkReferences() {
		return workReferences;
	}
	public void setWorkReferences(String WorkReferences) {
		this.workReferences = WorkReferences;
	}	
		
	private String creditReferences;
	public String getCreditReferences() {
		return creditReferences;
	}
	public void setCreditReferences(String CreditReferences) {
		this.creditReferences = CreditReferences;
	}	
		
	private int checkingAccountNumber;
	public int getCheckingAccountNumber() {
		return checkingAccountNumber;
	}
	public void setCheckingAccountNumber(int CheckingAccountNumber) {
		this.checkingAccountNumber = CheckingAccountNumber;
	}	
		
	private int securityNumber;
	public int getSecurityNumber() {
		return securityNumber;
	}
	public void setSecurityNumber(int SecurityNumber) {
		this.securityNumber = SecurityNumber;
	}	
		
	private int creditScore;
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int CreditScore) {
		this.creditScore = CreditScore;
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
	
				
	
		
		@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "referedLoanRequest")
		private Loan approvalLoan;
				
		public Loan getApprovalLoan() {
			return approvalLoan;
		}
				
		public void setApprovalLoan(Loan ApprovalLoan) {
			this.approvalLoan = ApprovalLoan;
		}
				
	
		@ManyToOne(targetEntity=CheckingAccount.class)
		@JoinColumn(name="requestedcahistory_id",referencedColumnName="id")
		private CheckingAccount requestedCAHistory;
				
		public CheckingAccount getRequestedCAHistory() {
			return requestedCAHistory;
		}
				
		public void setRequestedCAHistory(CheckingAccount RequestedCAHistory) {
			this.requestedCAHistory = RequestedCAHistory;
		}
				
	
		@ManyToOne(targetEntity=CreditHistory.class)
		@JoinColumn(name="requestedcredithistory_id",referencedColumnName="id")
		private CreditHistory requestedCreditHistory;
				
		public CreditHistory getRequestedCreditHistory() {
			return requestedCreditHistory;
		}
				
		public void setRequestedCreditHistory(CreditHistory RequestedCreditHistory) {
			this.requestedCreditHistory = RequestedCreditHistory;
		}
				
	
		@ManyToOne(targetEntity=ApprovalLetter.class)
		@JoinColumn(name="attachedapprovalletter_id",referencedColumnName="id")
		private ApprovalLetter attachedApprovalLetter;
				
		public ApprovalLetter getAttachedApprovalLetter() {
			return attachedApprovalLetter;
		}
				
		public void setAttachedApprovalLetter(ApprovalLetter AttachedApprovalLetter) {
			this.attachedApprovalLetter = AttachedApprovalLetter;
		}
				
	
		@ManyToOne(targetEntity=LoanAgreement.class)
		@JoinColumn(name="attachedloanagreement_id",referencedColumnName="id")
		private LoanAgreement attachedLoanAgreement;
				
		public LoanAgreement getAttachedLoanAgreement() {
			return attachedLoanAgreement;
		}
				
		public void setAttachedLoanAgreement(LoanAgreement AttachedLoanAgreement) {
			this.attachedLoanAgreement = AttachedLoanAgreement;
		}
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<LoanTerm> attachedLoanTerms = new ArrayList<LoanTerm>();
					
		public List<LoanTerm> getAttachedLoanTerms() {
			return attachedLoanTerms;
		}
				
		public void setAttachedLoanTerms(List<LoanTerm> AttachedLoanTerms) {
			this.attachedLoanTerms = AttachedLoanTerms;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanRequest other = (LoanRequest) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
