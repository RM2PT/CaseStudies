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
	public class Vehicle extends BaseEntity {
		
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
			

		
		@ManyToOne(targetEntity=Member.class)
		@JoinColumn(name="ownedmember_realid",referencedColumnName="realid")
		private Member ownedMember;
				
		public Member getOwnedMember() {
			return ownedMember;
		}
				
		public void setOwnedMember(Member OwnedMember) {
			this.ownedMember = OwnedMember;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Vehicle other = (Vehicle) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
