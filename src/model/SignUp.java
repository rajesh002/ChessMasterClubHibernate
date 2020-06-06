package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGINDATA")

public class SignUp {
	@Id
	@Column(name="username")
     private String username;
	@Column(name="password")
     private String password;
     public SignUp(String userName, String passWord, String confirmPassword) {
		super();
		this.username = userName;
		this.password = passWord;
		this.confirmPassword = confirmPassword;
	}
	private String confirmPassword;
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassWord() {
		return password;
	}
	public void setPassWord(String passWord) {
		this.password = passWord;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}    
}
