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
			public class Subject implements BaseEntity {
	
	/* all primary attributes */
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
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
	
				
	
		
//		@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "superSubject")
//		private Subject superSubject;
//
//		public Subject getSuperSubject() {
//			return superSubject;
//		}
//
//		public void setSuperSubject(Subject SuperSubject) {
//			this.superSubject = SuperSubject;
//		}
				
	
//		@JsonIgnore
//		@Fetch(FetchMode.SUBSELECT)
//		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="superSubject")
//				private List<Subject> subSubject = new ArrayList<Subject>();
//
//		public List<Subject> getSubSubject() {
//			return subSubject;
//		}
//
//		public void setSubSubject(List<Subject> SubSubject) {
//			this.subSubject = SubSubject;
//		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
