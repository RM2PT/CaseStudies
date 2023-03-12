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
			public class CommentReply implements BaseEntity {
	
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
	private String commentID;
	public String getCommentID() {
		return commentID;
	}
	public void setCommentID(String CommentID) {
		this.commentID = CommentID;
	}	
		
	private String commentor;
	public String getCommentor() {
		return commentor;
	}
	public void setCommentor(String Commentor) {
		this.commentor = Commentor;
	}	
		
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String Content) {
		this.content = Content;
	}	
		
	private String replier;
	public String getReplier() {
		return replier;
	}
	public void setReplier(String Replier) {
		this.replier = Replier;
	}	
		
	private Boolean isDeleted;
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean IsDeleted) {
		this.isDeleted = IsDeleted;
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
		
	
				
	
		@ManyToOne(targetEntity=Comment.class)
		@JoinColumn(name="commentreply2comment_id",referencedColumnName="id")
		private Comment commentreply2comment;
				
		public Comment getCommentreply2comment() {
			return commentreply2comment;
		}
				
		public void setCommentreply2comment(Comment commentreply2comment) {
			this.commentreply2comment = commentreply2comment;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentReply other = (CommentReply) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
