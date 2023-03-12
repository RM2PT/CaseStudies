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
			public class ActivityLog implements BaseEntity {
	
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
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String Type) {
		this.type = Type;
	}	
		
	private String operator;
	public String getOperator() {
		return operator;
	}
	public void setOperator(String Operator) {
		this.operator = Operator;
	}	
		
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String Content) {
		this.content = Content;
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
		
	
				
	
		@ManyToOne(targetEntity=Team.class)
		@JoinColumn(name="activitylog2team_id",referencedColumnName="id")
		private Team activitylog2team;
				
		public Team getActivitylog2team() {
			return activitylog2team;
		}
				
		public void setActivitylog2team(Team activitylog2team) {
			this.activitylog2team = activitylog2team;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActivityLog other = (ActivityLog) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
