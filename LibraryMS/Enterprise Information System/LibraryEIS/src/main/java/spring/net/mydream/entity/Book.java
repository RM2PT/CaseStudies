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
			public class Book implements BaseEntity {
	
	/* all primary attributes */
	private String callNo;
	public String getCallNo() {
		return callNo;
	}
	public void setCallNo(String CallNo) {
		this.callNo = CallNo;
	}	
		
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String Title) {
		this.title = Title;
	}	
		
	private String edition;
	public String getEdition() {
		return edition;
	}
	public void setEdition(String Edition) {
		this.edition = Edition;
	}	
		
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String Author) {
		this.author = Author;
	}	
		
	private String publisher;
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String Publisher) {
		this.publisher = Publisher;
	}	
		
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String Description) {
		this.description = Description;
	}	
		
	private String iSBn;
	public String getISBn() {
		return iSBn;
	}
	public void setISBn(String ISBn) {
		this.iSBn = ISBn;
	}	
		
	private int copyNum;
	public int getCopyNum() {
		return copyNum;
	}
	public void setCopyNum(int CopyNum) {
		this.copyNum = CopyNum;
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
	
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="bookBelongs")
				private List<BookCopy> copys = new ArrayList<BookCopy>();
					
		public List<BookCopy> getCopys() {
			return copys;
		}
				
		public void setCopys(List<BookCopy> Copys) {
			this.copys = Copys;
		}
		
				
	
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<Subject> subject = new ArrayList<Subject>();
					
		public List<Subject> getSubject() {
			return subject;
		}
				
		public void setSubject(List<Subject> Subject) {
			this.subject = Subject;
		}
		
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
