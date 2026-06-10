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
	public class Model extends BaseEntity {
		
		/* all primary attributes */
		private String title;
		public String getTitle() {
			return title;
		}
		public void setTitle(String Title) {
			this.title = Title;
		}	
			
		private String version;
		public String getVersion() {
			return version;
		}
		public void setVersion(String Version) {
			this.version = Version;
		}	
			
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String Id) {
			this.id = Id;
		}	
			
		private String description;
		public String getDescription() {
			return description;
		}
		public void setDescription(String Description) {
			this.description = Description;
		}	
			
		private Date lastUpdateTime;
		public Date getLastUpdateTime() {
			return lastUpdateTime;
		}
		public void setLastUpdateTime(Date LastUpdateTime) {
			this.lastUpdateTime = LastUpdateTime;
		}	
			
		private String keyword;
		public String getKeyword() {
			return keyword;
		}
		public void setKeyword(String Keyword) {
			this.keyword = Keyword;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedModel")
				private List<RunningModel> containedRunningModel = new ArrayList<RunningModel>();
					
		public List<RunningModel> getContainedRunningModel() {
			return containedRunningModel;
		}
				
		public void setContainedRunningModel(List<RunningModel> ContainedRunningModel) {
			this.containedRunningModel = ContainedRunningModel;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<DataSet> containedDataSet = new ArrayList<DataSet>();
					
		public List<DataSet> getContainedDataSet() {
			return containedDataSet;
		}
				
		public void setContainedDataSet(List<DataSet> ContainedDataSet) {
			this.containedDataSet = ContainedDataSet;
		}
		
		@ManyToOne(targetEntity=Attachment.class)
		@JoinColumn(name="modeltoattachment_realid",referencedColumnName="realid")
		private Attachment modeltoAttachment;
				
		public Attachment getModeltoAttachment() {
			return modeltoAttachment;
		}
				
		public void setModeltoAttachment(Attachment ModeltoAttachment) {
			this.modeltoAttachment = ModeltoAttachment;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Model other = (Model) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
