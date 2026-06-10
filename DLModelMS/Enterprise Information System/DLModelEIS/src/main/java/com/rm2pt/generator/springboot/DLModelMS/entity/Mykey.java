	package com.rm2pt.generator.springboot.DLModelMS.entity;
	
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
	public class Mykey extends BaseEntity {
		
		/* all primary attributes */
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String Id) {
			this.id = Id;
		}	
			
		private Boolean isValid;
		public Boolean getIsValid() {
			return isValid;
		}
		public void setIsValid(Boolean IsValid) {
			this.isValid = IsValid;
		}	
			

		
		@ManyToOne(targetEntity=RunningModel.class)
		@JoinColumn(name="belongedrunningmodel_realid",referencedColumnName="realid")
		private RunningModel belongedRunningModel;
				
		public RunningModel getBelongedRunningModel() {
			return belongedRunningModel;
		}
				
		public void setBelongedRunningModel(RunningModel BelongedRunningModel) {
			this.belongedRunningModel = BelongedRunningModel;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Mykey other = (Mykey) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
