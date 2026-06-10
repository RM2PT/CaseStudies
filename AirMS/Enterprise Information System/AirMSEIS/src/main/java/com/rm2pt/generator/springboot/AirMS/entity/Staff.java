	package com.rm2pt.generator.springboot.AirMS.entity;
	
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
	public class Staff extends BaseEntity {
		
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
			
		private String password;
		public String getPassword() {
			return password;
		}
		public void setPassword(String Password) {
			this.password = Password;
		}	
			
		private String phone;
		public String getPhone() {
			return phone;
		}
		public void setPhone(String Phone) {
			this.phone = Phone;
		}	
			
		private int role;
		public int getRole() {
			return role;
		}
		public void setRole(int Role) {
			this.role = Role;
		}	
			

		
		
		@ManyToOne(cascade = CascadeType.REFRESH)
		private Staff boss;
				
		public Staff getBoss() {
			return boss;
		}
				
		public void setBoss(Staff Boss) {
			this.boss = Boss;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Staff other = (Staff) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
