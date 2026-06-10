package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class EnterLoanInformationMessage{
	public int requestid;
	public int getRequestid() {
		return requestid;
	}
					
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public double loanamount;
	public double getLoanamount() {
		return loanamount;
	}
					
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	public String loanpurpose;
	public String getLoanpurpose() {
		return loanpurpose;
	}
					
	public void setLoanpurpose(String loanpurpose) {
		this.loanpurpose = loanpurpose;
	}
	public double income;
	public double getIncome() {
		return income;
	}
					
	public void setIncome(double income) {
		this.income = income;
	}
	public int phonenumber;
	public int getPhonenumber() {
		return phonenumber;
	}
					
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String postaladdress;
	public String getPostaladdress() {
		return postaladdress;
	}
					
	public void setPostaladdress(String postaladdress) {
		this.postaladdress = postaladdress;
	}
	public int zipcode;
	public int getZipcode() {
		return zipcode;
	}
					
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String email;
	public String getEmail() {
		return email;
	}
					
	public void setEmail(String email) {
		this.email = email;
	}
	public String workreferences;
	public String getWorkreferences() {
		return workreferences;
	}
					
	public void setWorkreferences(String workreferences) {
		this.workreferences = workreferences;
	}
	public String creditreferences;
	public String getCreditreferences() {
		return creditreferences;
	}
					
	public void setCreditreferences(String creditreferences) {
		this.creditreferences = creditreferences;
	}
	public int checkingaccountnumber;
	public int getCheckingaccountnumber() {
		return checkingaccountnumber;
	}
					
	public void setCheckingaccountnumber(int checkingaccountnumber) {
		this.checkingaccountnumber = checkingaccountnumber;
	}
	public int securitynumber;
	public int getSecuritynumber() {
		return securitynumber;
	}
					
	public void setSecuritynumber(int securitynumber) {
		this.securitynumber = securitynumber;
	}
}
