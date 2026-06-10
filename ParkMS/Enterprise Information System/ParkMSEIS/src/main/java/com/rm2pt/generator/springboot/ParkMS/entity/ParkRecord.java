	package com.rm2pt.generator.springboot.ParkMS.entity;
	
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
	public class ParkRecord extends BaseEntity {
		
		/* all primary attributes */
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int Id) {
			this.id = Id;
		}	
			
		private String plateNumber;
		public String getPlateNumber() {
			return plateNumber;
		}
		public void setPlateNumber(String PlateNumber) {
			this.plateNumber = PlateNumber;
		}	
			
		private Integer type;
		public Integer getType() {
			return type;
		}
		public void setType(Integer Type) {
			this.type = Type;
		}	
			
		private Date entryTime;
		public Date getEntryTime() {
			return entryTime;
		}
		public void setEntryTime(Date EntryTime) {
			this.entryTime = EntryTime;
		}	
			
		private Date outTime;
		public Date getOutTime() {
			return outTime;
		}
		public void setOutTime(Date OutTime) {
			this.outTime = OutTime;
		}	
			
		private Boolean isParking;
		public Boolean getIsParking() {
			return isParking;
		}
		public void setIsParking(Boolean IsParking) {
			this.isParking = IsParking;
		}	
			
		private double totalPayment;
		public double getTotalPayment() {
			return totalPayment;
		}
		public void setTotalPayment(double TotalPayment) {
			this.totalPayment = TotalPayment;
		}	
			
		private String description;
		public String getDescription() {
			return description;
		}
		public void setDescription(String Description) {
			this.description = Description;
		}	
			

		
		@ManyToOne(targetEntity=Park.class)
		@JoinColumn(name="ownedpark_realid",referencedColumnName="realid")
		private Park ownedPark;
				
		public Park getOwnedPark() {
			return ownedPark;
		}
				
		public void setOwnedPark(Park OwnedPark) {
			this.ownedPark = OwnedPark;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ParkRecord other = (ParkRecord) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
