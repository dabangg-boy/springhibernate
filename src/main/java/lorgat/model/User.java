package lorgat.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="User")
public class User {

	@Id
	@Column(name="userid")
	@GeneratedValue
	private int userid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dob")
	@Type(type = "date")
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
	@Column(name="email")
	private String email;
	
	public User(){}
	
	public User(String firstname, String lastname, Date dob, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.email = email;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
