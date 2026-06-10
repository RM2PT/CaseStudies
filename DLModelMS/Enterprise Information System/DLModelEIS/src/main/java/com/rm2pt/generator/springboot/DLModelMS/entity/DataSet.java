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
	public class DataSet extends BaseEntity {
		
		/* all primary attributes */
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String Id) {
			this.id = Id;
		}	
			
		private String content;
		public String getContent() {
			return content;
		}
		public void setContent(String Content) {
			this.content = Content;
		}	
			
		private Date lastUpdateTime;
		public Date getLastUpdateTime() {
			return lastUpdateTime;
		}
		public void setLastUpdateTime(Date LastUpdateTime) {
			this.lastUpdateTime = LastUpdateTime;
		}	
			

		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DataSet other = (DataSet) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
