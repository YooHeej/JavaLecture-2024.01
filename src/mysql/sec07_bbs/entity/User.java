package mysql.sec07_bbs.entity;

import java.time.LocalDate;

public class User {
	private String uid;
	private String pwd;
	private String uname;
	private String email;
	private LocalDate regDate;
	private int isDelete;
	
	public User() {	}

	public User(String uid, String pwd, String uname, String email) {
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
	}

	public User(String uid, String pwd, String uname, String email, LocalDate regDate, int isDelete) {
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.regDate = regDate;
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", email=" + email + ", regDate=" + regDate + ", isDelete="
				+ isDelete + "]";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	
}