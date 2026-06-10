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
	public class RunningModel extends BaseEntity {
		
		/* all primary attributes */
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String Id) {
			this.id = Id;
		}	
			
		private String assignedResource;
		public String getAssignedResource() {
			return assignedResource;
		}
		public void setAssignedResource(String AssignedResource) {
			this.assignedResource = AssignedResource;
		}	
			
		private String aPI;
		public String getAPI() {
			return aPI;
		}
		public void setAPI(String API) {
			this.aPI = API;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedRunningModel")
				private List<Mykey> containedKey = new ArrayList<Mykey>();
					
		public List<Mykey> getContainedKey() {
			return containedKey;
		}
				
		public void setContainedKey(List<Mykey> ContainedKey) {
			this.containedKey = ContainedKey;
		}
		
		@ManyToOne(targetEntity=Model.class)
		@JoinColumn(name="belongedmodel_realid",referencedColumnName="realid")
		private Model belongedModel;
				
		public Model getBelongedModel() {
			return belongedModel;
		}
				
		public void setBelongedModel(Model BelongedModel) {
			this.belongedModel = BelongedModel;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			RunningModel other = (RunningModel) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
