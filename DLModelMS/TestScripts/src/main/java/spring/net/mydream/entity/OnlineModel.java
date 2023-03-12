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
			public class OnlineModel implements BaseEntity {
	
	/* all primary attributes */
	@Id  // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String assignedResource;
	public String getAssignedResource() {
		return assignedResource;
	}
	public void setAssignedResource(String AssignedResource) {
		this.assignedResource = AssignedResource;
	}	
		
	
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedOnlineModel")
				private List<API> containedAPI = new ArrayList<API>();
					
		public List<API> getContainedAPI() {
			return containedAPI;
		}
				
		public void setContainedAPI(List<API> ContainedAPI) {
			this.containedAPI = ContainedAPI;
		}
		
				
	
		@ManyToOne(targetEntity=Model.class)
		@JoinColumn(name="belongedmodel_id",referencedColumnName="id")
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
		OnlineModel other = (OnlineModel) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
