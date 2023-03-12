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
			public class Project implements BaseEntity {
	
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
		
	
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<MK> project2mk = new ArrayList<MK>();
					
		public List<MK> getProject2mk() {
			return project2mk;
		}
				
		public void setProject2mk(List<MK> project2mk) {
			this.project2mk = project2mk;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Author> project2author = new ArrayList<Author>();
					
		public List<Author> getProject2author() {
			return project2author;
		}
				
		public void setProject2author(List<Author> project2author) {
			this.project2author = project2author;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Keyword> project2keyword = new ArrayList<Keyword>();
					
		public List<Keyword> getProject2keyword() {
			return project2keyword;
		}
				
		public void setProject2keyword(List<Keyword> project2keyword) {
			this.project2keyword = project2keyword;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="projectHistory2project")
				private List<ProjectHistory> project2projectHistory = new ArrayList<ProjectHistory>();
					
		public List<ProjectHistory> getProject2projectHistory() {
			return project2projectHistory;
		}
				
		public void setProject2projectHistory(List<ProjectHistory> project2projectHistory) {
			this.project2projectHistory = project2projectHistory;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
