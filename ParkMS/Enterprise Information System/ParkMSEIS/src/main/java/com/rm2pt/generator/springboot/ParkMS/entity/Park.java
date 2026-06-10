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
	public class Park extends BaseEntity {
		
		/* all primary attributes */
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int Id) {
			this.id = Id;
		}	
			
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String Name) {
			this.name = Name;
		}	
			
		private String location;
		public String getLocation() {
			return location;
		}
		public void setLocation(String Location) {
			this.location = Location;
		}	
			
		private double smallPrice;
		public double getSmallPrice() {
			return smallPrice;
		}
		public void setSmallPrice(double SmallPrice) {
			this.smallPrice = SmallPrice;
		}	
			
		private double largePrice;
		public double getLargePrice() {
			return largePrice;
		}
		public void setLargePrice(double LargePrice) {
			this.largePrice = LargePrice;
		}	
			
		private double motoPrice;
		public double getMotoPrice() {
			return motoPrice;
		}
		public void setMotoPrice(double MotoPrice) {
			this.motoPrice = MotoPrice;
		}	
			
		private Boolean isOpened;
		public Boolean getIsOpened() {
			return isOpened;
		}
		public void setIsOpened(Boolean IsOpened) {
			this.isOpened = IsOpened;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Member> owningMembers = new ArrayList<Member>();
					
		public List<Member> getOwningMembers() {
			return owningMembers;
		}
				
		public void setOwningMembers(List<Member> OwningMembers) {
			this.owningMembers = OwningMembers;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="ownedPark")
				private List<ParkRecord> owningRecords = new ArrayList<ParkRecord>();
					
		public List<ParkRecord> getOwningRecords() {
			return owningRecords;
		}
				
		public void setOwningRecords(List<ParkRecord> OwningRecords) {
			this.owningRecords = OwningRecords;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Park other = (Park) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
