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
			public class BookCopy implements BaseEntity {
	
	/* all primary attributes */
	private String barcode;
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String Barcode) {
		this.barcode = Barcode;
	}	
		
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer Status) {
		this.status = Status;
	}	
		
	private String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String Location) {
		this.location = Location;
	}	
		
	private Boolean isReserved;
	public Boolean getIsReserved() {
		return isReserved;
	}
	public void setIsReserved(Boolean IsReserved) {
		this.isReserved = IsReserved;
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
	
				
	
		@ManyToOne(targetEntity=Book.class)
		@JoinColumn(name="bookbelongs_id",referencedColumnName="id")
		private Book bookBelongs;
				
		public Book getBookBelongs() {
			return bookBelongs;
		}
				
		public void setBookBelongs(Book BookBelongs) {
			this.bookBelongs = BookBelongs;
		}
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="loanedCopy")
				private List<Loan> loanedRecord = new ArrayList<Loan>();
					
		public List<Loan> getLoanedRecord() {
			return loanedRecord;
		}
				
		public void setLoanedRecord(List<Loan> LoanedRecord) {
			this.loanedRecord = LoanedRecord;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="reservedCopy")
				private List<Reserve> reservationRecord = new ArrayList<Reserve>();
					
		public List<Reserve> getReservationRecord() {
			return reservationRecord;
		}
				
		public void setReservationRecord(List<Reserve> ReservationRecord) {
			this.reservationRecord = ReservationRecord;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookCopy other = (BookCopy) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
