package model;

public class Member {
	private String email;
	private String pwd;
	private String name;
	private String birth;
	private String gender;
	public Member(String email, String pwd, String name, String birth, String gender) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Member [email=" + email + ", pwd=" + pwd + ", name=" + name + ", birth=" + birth + ", gender=" + gender
				+ "]";
	}
	
	
}
