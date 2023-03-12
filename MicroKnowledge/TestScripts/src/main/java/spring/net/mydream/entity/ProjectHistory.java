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
			public class ProjectHistory implements BaseEntity {
	
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
		
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String Title) {
		this.title = Title;
	}	
		
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String Content) {
		this.content = Content;
	}	
		
	private String creator;
	public String getCreator() {
		return creator;
	}
	public void setCreator(String Creator) {
		this.creator = Creator;
	}	
		
	private Date createdTime;
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date CreatedTime) {
		this.createdTime = CreatedTime;
	}	
		
	private Date modifiedTime;
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date ModifiedTime) {
		this.modifiedTime = ModifiedTime;
	}	
		
	
				
	
		@ManyToOne(targetEntity=Project.class)
		@JoinColumn(name="projecthistory2project_id",referencedColumnName="id")
		private Project projectHistory2project;
				
		public Project getProjectHistory2project() {
			return projectHistory2project;
		}
				
		public void setProjectHistory2project(Project projectHistory2project) {
			this.projectHistory2project = projectHistory2project;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectHistory other = (ProjectHistory) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
