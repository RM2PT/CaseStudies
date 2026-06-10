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
	public class Member extends BaseEntity {
		
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
			
		private double balance;
		public double getBalance() {
			return balance;
		}
		public void setBalance(double Balance) {
			this.balance = Balance;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Park> parks = new ArrayList<Park>();
					
		public List<Park> getParks() {
			return parks;
		}
				
		public void setParks(List<Park> Parks) {
			this.parks = Parks;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="ownedMember")
				private List<Vehicle> owningVehicles = new ArrayList<Vehicle>();
					
		public List<Vehicle> getOwningVehicles() {
			return owningVehicles;
		}
				
		public void setOwningVehicles(List<Vehicle> OwningVehicles) {
			this.owningVehicles = OwningVehicles;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Member other = (Member) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
