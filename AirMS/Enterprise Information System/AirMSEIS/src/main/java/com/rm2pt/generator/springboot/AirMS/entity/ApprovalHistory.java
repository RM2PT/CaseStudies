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
	public class ApprovalHistory extends BaseEntity {
		
		/* all primary attributes */
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int Id) {
			this.id = Id;
		}	
			
		private int staffId;
		public int getStaffId() {
			return staffId;
		}
		public void setStaffId(int StaffId) {
			this.staffId = StaffId;
		}	
			
		private Boolean reject;
		public Boolean getReject() {
			return reject;
		}
		public void setReject(Boolean Reject) {
			this.reject = Reject;
		}	
			
		private String suggestion;
		public String getSuggestion() {
			return suggestion;
		}
		public void setSuggestion(String Suggestion) {
			this.suggestion = Suggestion;
		}	
			

		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ApprovalHistory other = (ApprovalHistory) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
