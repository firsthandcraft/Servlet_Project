package model;

import java.sql.Date;

public class Music {
	private String Mtitle; 
	private Date Mdate;
	private String Mproducer; 
	private String Mtext; 
	private String Mimg;
	private String s_email;
	private String Mseller;//==MembershipPlan==seller
	public Music(String mtitle, Date mdate, String mproducer, String mtext, String mimg, String s_email,
			String mseller) {
		super();
		Mtitle = mtitle;
		Mdate = mdate;
		Mproducer = mproducer;
		Mtext = mtext;
		Mimg = mimg;
		this.s_email = s_email;
		Mseller = mseller;
	}
	public Music() {
		super();
	}
	public String getMtitle() {
		return Mtitle;
	}
	public void setMtitle(String mtitle) {
		Mtitle = mtitle;
	}
	public Date getMdate() {
		return Mdate;
	}
	public void setMdate(Date mdate) {
		Mdate = mdate;
	}
	public String getMproducer() {
		return Mproducer;
	}
	public void setMproducer(String mproducer) {
		Mproducer = mproducer;
	}
	public String getMtext() {
		return Mtext;
	}
	public void setMtext(String mtext) {
		Mtext = mtext;
	}
	public String getMimg() {
		return Mimg;
	}
	public void setMimg(String mimg) {
		Mimg = mimg;
	}
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	public String getMseller() {
		return Mseller;
	}
	public void setMseller(String mseller) {
		Mseller = mseller;
	}
	@Override
	public String toString() {
		return "Music [Mtitle=" + Mtitle + ", Mdate=" + Mdate + ", Mproducer=" + Mproducer + ", Mtext=" + Mtext
				+ ", Mimg=" + Mimg + ", s_email=" + s_email + ", Mseller=" + Mseller + "]";
	}
	
}
