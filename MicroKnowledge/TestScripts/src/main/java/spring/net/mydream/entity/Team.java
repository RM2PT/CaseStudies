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
			public class Team implements BaseEntity {
	
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
		
	private int memberCount;
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int MemberCount) {
		this.memberCount = MemberCount;
	}	
		
	private int mKCount;
	public int getMKCount() {
		return mKCount;
	}
	public void setMKCount(int MKCount) {
		this.mKCount = MKCount;
	}	
		
	
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="member2team")
				private List<User> team2member = new ArrayList<User>();
					
		public List<User> getTeam2member() {
			return team2member;
		}
				
		public void setTeam2member(List<User> team2member) {
			this.team2member = team2member;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="activitylog2team")
				private List<ActivityLog> team2activitylog = new ArrayList<ActivityLog>();
					
		public List<ActivityLog> getTeam2activitylog() {
			return team2activitylog;
		}
				
		public void setTeam2activitylog(List<ActivityLog> team2activitylog) {
			this.team2activitylog = team2activitylog;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="mk2team")
				private List<MK> team2mk = new ArrayList<MK>();
					
		public List<MK> getTeam2mk() {
			return team2mk;
		}
				
		public void setTeam2mk(List<MK> team2mk) {
			this.team2mk = team2mk;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="group2team")
				private List<Grp> team2group = new ArrayList<Grp>();
					
		public List<Grp> getTeam2group() {
			return team2group;
		}
				
		public void setTeam2group(List<Grp> team2group) {
			this.team2group = team2group;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="comment2team")
				private List<Comment> team2comment = new ArrayList<Comment>();
					
		public List<Comment> getTeam2comment() {
			return team2comment;
		}
				
		public void setTeam2comment(List<Comment> team2comment) {
			this.team2comment = team2comment;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
