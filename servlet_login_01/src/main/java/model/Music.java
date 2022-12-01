package model;

import java.sql.Date;

public class Music {
	private String Mtitle; 
	private Date Mdate;
	private String Mproducer; 
	private String Mtext; 
	private String Mimg;
	private String seller;
	public Music(String mtitle, Date mdate, String mproducer, String mtext, String mimg, String seller) {
		super();
		Mtitle = mtitle;
		Mdate = mdate;
		Mproducer = mproducer;
		Mtext = mtext;
		Mimg = mimg;
		this.seller = seller;
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
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	@Override
	public String toString() {
		return "Music [Mtitle=" + Mtitle + ", Mdate=" + Mdate + ", Mproducer=" + Mproducer + ", Mtext=" + Mtext
				+ ", Mimg=" + Mimg + ", seller=" + seller + "]";
	}
}
