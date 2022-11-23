package model;

public class Member {
	private String email;
	private String pwd;
	private String name;
	private String year;
	private String month;
	private String day;
	private int gender;
	public Member(String email, String pwd, String name, String year, String month, String day, int gender) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.year = year;
		this.month = month;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
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
		return "Member [email=" + email + ", pwd=" + pwd + ", name=" + name + ", year=" + year + ", month=" + month
				+ ", day=" + day + ", gender=" + gender + "]";
	}
	
}
