package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateUserMessage{
	public String userid;
	public String getUserid() {
		return userid;
	}
					
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public Integer sex;
	public Integer getSex() {
		return sex;
	}
					
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String password;
	public String getPassword() {
		return password;
	}
					
	public void setPassword(String password) {
		this.password = password;
	}
	public String email;
	public String getEmail() {
		return email;
	}
					
	public void setEmail(String email) {
		this.email = email;
	}
	public String faculty;
	public String getFaculty() {
		return faculty;
	}
					
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int loanednumber;
	public int getLoanednumber() {
		return loanednumber;
	}
					
	public void setLoanednumber(int loanednumber) {
		this.loanednumber = loanednumber;
	}
	public Integer borrowstatus;
	public Integer getBorrowstatus() {
		return borrowstatus;
	}
					
	public void setBorrowstatus(Integer borrowstatus) {
		this.borrowstatus = borrowstatus;
	}
	public int suspensiondays;
	public int getSuspensiondays() {
		return suspensiondays;
	}
					
	public void setSuspensiondays(int suspensiondays) {
		this.suspensiondays = suspensiondays;
	}
	public double overduefee;
	public double getOverduefee() {
		return overduefee;
	}
					
	public void setOverduefee(double overduefee) {
		this.overduefee = overduefee;
	}
}
