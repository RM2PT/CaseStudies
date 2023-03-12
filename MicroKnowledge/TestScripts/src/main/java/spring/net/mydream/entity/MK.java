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
			public class MK implements BaseEntity {
	
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
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}	
		
	private String groupID;
	public String getGroupID() {
		return groupID;
	}
	public void setGroupID(String GroupID) {
		this.groupID = GroupID;
	}	
		
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String Type) {
		this.type = Type;
	}	
		
	private String projectID;
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String ProjectID) {
		this.projectID = ProjectID;
	}	
		
	private String version;
	public String getVersion() {
		return version;
	}
	public void setVersion(String Version) {
		this.version = Version;
	}	
		
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String Content) {
		this.content = Content;
	}	
		
	
				
	
		@ManyToOne(targetEntity=Team.class)
		@JoinColumn(name="mk2team_id",referencedColumnName="id")
		private Team mk2team;
				
		public Team getMk2team() {
			return mk2team;
		}
				
		public void setMk2team(Team mk2team) {
			this.mk2team = mk2team;
		}
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Project> mk2project = new ArrayList<Project>();
					
		public List<Project> getMk2project() {
			return mk2project;
		}
				
		public void setMk2project(List<Project> mk2project) {
			this.mk2project = mk2project;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MK other = (MK) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
