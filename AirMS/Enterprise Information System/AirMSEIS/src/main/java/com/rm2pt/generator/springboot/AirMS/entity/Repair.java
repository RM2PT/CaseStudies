	package com.rm2pt.generator.springboot.AirMS.entity;
	
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
	public class Repair extends BaseEntity {
		
		/* all primary attributes */
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int Id) {
			this.id = Id;
		}	
			
		private String repairname;
		public String getRepairname() {
			return repairname;
		}
		public void setRepairname(String Repairname) {
			this.repairname = Repairname;
		}	
			
		private int price;
		public int getPrice() {
			return price;
		}
		public void setPrice(int Price) {
			this.price = Price;
		}	
			
		private String description;
		public String getDescription() {
			return description;
		}
		public void setDescription(String Description) {
			this.description = Description;
		}	
			
		private int score;
		public int getScore() {
			return score;
		}
		public void setScore(int Score) {
			this.score = Score;
		}	
			
		private Date failTime;
		public Date getFailTime() {
			return failTime;
		}
		public void setFailTime(Date FailTime) {
			this.failTime = FailTime;
		}	
			
		private Boolean close;
		public Boolean getClose() {
			return close;
		}
		public void setClose(Boolean Close) {
			this.close = Close;
		}	
			
		private int process;
		public int getProcess() {
			return process;
		}
		public void setProcess(int Process) {
			this.process = Process;
		}	
			
		private String result;
		public String getResult() {
			return result;
		}
		public void setResult(String Result) {
			this.result = Result;
		}	
			

		
		@JsonIgnore
		@Fetch(FetchMode.SUBSELECT)
		@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
				private List<ApprovalHistory> history = new ArrayList<ApprovalHistory>();
					
		public List<ApprovalHistory> getHistory() {
			return history;
		}
				
		public void setHistory(List<ApprovalHistory> History) {
			this.history = History;
		}
		
		@ManyToOne(targetEntity=Device.class)
		@JoinColumn(name="relateddevice_realid",referencedColumnName="realid")
		private Device relatedDevice;
				
		public Device getRelatedDevice() {
			return relatedDevice;
		}
				
		public void setRelatedDevice(Device RelatedDevice) {
			this.relatedDevice = RelatedDevice;
		}
		
		@ManyToOne(targetEntity=Staff.class)
		@JoinColumn(name="raisestaff_realid",referencedColumnName="realid")
		private Staff raiseStaff;
				
		public Staff getRaiseStaff() {
			return raiseStaff;
		}
				
		public void setRaiseStaff(Staff RaiseStaff) {
			this.raiseStaff = RaiseStaff;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Repair other = (Repair) obj;
			if (!this.getRealid().equals(other.getRealid()))
				return false;
			else
				return true;
		}
	}
