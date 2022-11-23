package model;

public class Member {
	private String email;
	private String pwd;
	private String name;
	private String day;
	private int gender;
	public Member(String email, String pwd, String name, String day, int gender) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.day = day;
		this.gender = gender;
	}
	public Member() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Member [email=" + email + ", pwd=" + pwd + ", name=" + name + ", day=" + day + ", gender=" + gender
				+ "]";
	}

	
}
