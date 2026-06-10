	package com.rm2pt.generator.springboot.MicroK.entity;
	
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
	public class User extends BaseEntity {
		
		/* all primary attributes */
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String Id) {
			this.id = Id;
		}	
			
		private String password;
		public String getPassword() {
			return password;
		}
		public void setPassword(String Password) {
			this.password = Password;
		}	
			
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String Name) {
			this.name = Name;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedUser")
				private List<Microknowledge> staredMicroknowledge = new ArrayList<Microknowledge>();
					
		public List<Microknowledge> getStaredMicroknowledge() {
			return staredMicroknowledge;
		}
				
		public void setStaredMicroknowledge(List<Microknowledge> StaredMicroknowledge) {
			this.staredMicroknowledge = StaredMicroknowledge;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="commenttoReader")
				private List<Comment> readertoComment = new ArrayList<Comment>();
					
		public List<Comment> getReadertoComment() {
			return readertoComment;
		}
				
		public void setReadertoComment(List<Comment> ReadertoComment) {
			this.readertoComment = ReadertoComment;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedUser")
				private List<Microknowledge> containedMicroknowledge = new ArrayList<Microknowledge>();
					
		public List<Microknowledge> getContainedMicroknowledge() {
			return containedMicroknowledge;
		}
				
		public void setContainedMicroknowledge(List<Microknowledge> ContainedMicroknowledge) {
			this.containedMicroknowledge = ContainedMicroknowledge;
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
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
