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
			public class API implements BaseEntity {
	
	/* all primary attributes */
	private String token;
	public String getToken() {
		return token;
	}
	public void setToken(String Token) {
		this.token = Token;
	}	
		
	private Boolean isValid;
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean IsValid) {
		this.isValid = IsValid;
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
	
				
	
		@ManyToOne(targetEntity=OnlineModel.class)
		@JoinColumn(name="belongedonlinemodel_id",referencedColumnName="id")
		private OnlineModel belongedOnlineModel;
				
		public OnlineModel getBelongedOnlineModel() {
			return belongedOnlineModel;
		}
				
		public void setBelongedOnlineModel(OnlineModel BelongedOnlineModel) {
			this.belongedOnlineModel = BelongedOnlineModel;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		API other = (API) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
