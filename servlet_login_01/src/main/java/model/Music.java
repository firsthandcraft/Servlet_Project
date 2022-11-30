package model;

public class Music {
	private String Mtitle; 
	private String Mname; 
	private String Mtext; 
	private String img;
	public Music(String mtitle, String mname, String mtext, String img) {
		super();
		Mtitle = mtitle;
		Mname = mname;
		Mtext = mtext;
		this.img = img;
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
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getMtext() {
		return Mtext;
	}
	public void setMtext(String mtext) {
		Mtext = mtext;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Music [Mtitle=" + Mtitle + ", Mname=" + Mname + ", Mtext=" + Mtext + ", img=" + img + "]";
	} 

	
}
