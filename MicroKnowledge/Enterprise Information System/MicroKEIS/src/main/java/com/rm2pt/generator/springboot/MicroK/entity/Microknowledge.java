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
	public class Microknowledge extends BaseEntity {
		
		/* all primary attributes */
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String Id) {
			this.id = Id;
		}	
			
		private String keywords;
		public String getKeywords() {
			return keywords;
		}
		public void setKeywords(String Keywords) {
			this.keywords = Keywords;
		}	
			
		private String content;
		public String getContent() {
			return content;
		}
		public void setContent(String Content) {
			this.content = Content;
		}	
			
		private int starNumber;
		public int getStarNumber() {
			return starNumber;
		}
		public void setStarNumber(int StarNumber) {
			this.starNumber = StarNumber;
		}	
			
		private Date lastEditTime;
		public Date getLastEditTime() {
			return lastEditTime;
		}
		public void setLastEditTime(Date LastEditTime) {
			this.lastEditTime = LastEditTime;
		}	
			

		
		@ManyToOne(targetEntity=User.class)
		@JoinColumn(name="belongeduser_realid",referencedColumnName="realid")
		private User belongedUser;
				
		public User getBelongedUser() {
			return belongedUser;
		}
				
		public void setBelongedUser(User BelongedUser) {
			this.belongedUser = BelongedUser;
		}
		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="commenttoMicroknowledge")
				private List<Comment> containedComment = new ArrayList<Comment>();
					
		public List<Comment> getContainedComment() {
			return containedComment;
		}
				
		public void setContainedComment(List<Comment> ContainedComment) {
			this.containedComment = ContainedComment;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Microknowledge other = (Microknowledge) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
