package spring.net.mydream.entity;

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
			public class Model implements BaseEntity {
	
	/* all primary attributes */
	private String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String Location) {
		this.location = Location;
	}	
		
	private String version;
	public String getVersion() {
		return version;
	}
	public void setVersion(String Version) {
		this.version = Version;
	}	
		
	@Id  // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedModel")
				private List<ModelAccessLink> containedModelAccessLink = new ArrayList<ModelAccessLink>();
					
		public List<ModelAccessLink> getContainedModelAccessLink() {
			return containedModelAccessLink;
		}
				
		public void setContainedModelAccessLink(List<ModelAccessLink> ContainedModelAccessLink) {
			this.containedModelAccessLink = ContainedModelAccessLink;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedModel")
				private List<OnlineModel> containedOnlineModel = new ArrayList<OnlineModel>();
					
		public List<OnlineModel> getContainedOnlineModel() {
			return containedOnlineModel;
		}
				
		public void setContainedOnlineModel(List<OnlineModel> ContainedOnlineModel) {
			this.containedOnlineModel = ContainedOnlineModel;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Administrator> containedAdministrator = new ArrayList<Administrator>();
					
		public List<Administrator> getContainedAdministrator() {
			return containedAdministrator;
		}
				
		public void setContainedAdministrator(List<Administrator> ContainedAdministrator) {
			this.containedAdministrator = ContainedAdministrator;
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
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
