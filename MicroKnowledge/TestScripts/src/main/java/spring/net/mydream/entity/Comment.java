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
			public class Comment implements BaseEntity {
	
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
		
	private String sourceType;
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String SourceType) {
		this.sourceType = SourceType;
	}	
		
	private String sourceID;
	public String getSourceID() {
		return sourceID;
	}
	public void setSourceID(String SourceID) {
		this.sourceID = SourceID;
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
		
	private int replyCount;
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int ReplyCount) {
		this.replyCount = ReplyCount;
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
		
	
				
	
		@ManyToOne(targetEntity=Team.class)
		@JoinColumn(name="comment2team_id",referencedColumnName="id")
		private Team comment2team;
				
		public Team getComment2team() {
			return comment2team;
		}
				
		public void setComment2team(Team comment2team) {
			this.comment2team = comment2team;
		}
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="commentreply2comment")
				private List<CommentReply> comment2commentreply = new ArrayList<CommentReply>();
					
		public List<CommentReply> getComment2commentreply() {
			return comment2commentreply;
		}
				
		public void setComment2commentreply(List<CommentReply> comment2commentreply) {
			this.comment2commentreply = comment2commentreply;
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
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
