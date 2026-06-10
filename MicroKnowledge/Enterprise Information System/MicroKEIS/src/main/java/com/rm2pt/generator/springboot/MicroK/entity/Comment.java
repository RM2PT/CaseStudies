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
	public class Comment extends BaseEntity {
		
		/* all primary attributes */
		private String content;
		public String getContent() {
			return content;
		}
		public void setContent(String Content) {
			this.content = Content;
		}	
			
		private Date writingTime;
		public Date getWritingTime() {
			return writingTime;
		}
		public void setWritingTime(Date WritingTime) {
			this.writingTime = WritingTime;
		}	
			

		
		@ManyToOne(targetEntity=User.class)
		@JoinColumn(name="commenttoreader_realid",referencedColumnName="realid")
		private User commenttoReader;
				
		public User getCommenttoReader() {
			return commenttoReader;
		}
				
		public void setCommenttoReader(User CommenttoReader) {
			this.commenttoReader = CommenttoReader;
		}
		
		@ManyToOne(targetEntity=Microknowledge.class)
		@JoinColumn(name="commenttomicroknowledge_realid",referencedColumnName="realid")
		private Microknowledge commenttoMicroknowledge;
				
		public Microknowledge getCommenttoMicroknowledge() {
			return commenttoMicroknowledge;
		}
				
		public void setCommenttoMicroknowledge(Microknowledge CommenttoMicroknowledge) {
			this.commenttoMicroknowledge = CommenttoMicroknowledge;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Comment other = (Comment) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
