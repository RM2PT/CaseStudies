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
			public class User implements BaseEntity {
	
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
		
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String Password) {
		this.password = Password;
	}	
		
	private Integer type;
	public Integer getType() {
		return type;
	}
	public void setType(Integer Type) {
		this.type = Type;
	}	
		
	
				
	
		@ManyToOne(targetEntity=Team.class)
		@JoinColumn(name="member2team_id",referencedColumnName="id")
		private Team member2team;
				
		public Team getMember2team() {
			return member2team;
		}
				
		public void setMember2team(Team member2team) {
			this.member2team = member2team;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
