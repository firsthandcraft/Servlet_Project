package model;

import java.sql.Date;

public class Product {
	private String p_num;
	private String p_title; 
	private Date p_date;
	private String p_producer; 
	private String p_text; 
	private String p_img;
	private String p_email;
	private String p_seller;//==MembershipPlan==seller
	public Product(String p_num, String p_title, Date p_date, String p_producer, String p_text, String p_img,
			String p_email, String p_seller) {
		super();
		this.p_num = p_num;
		this.p_title = p_title;
		this.p_date = p_date;
		this.p_producer = p_producer;
		this.p_text = p_text;
		this.p_img = p_img;
		this.p_email = p_email;
		this.p_seller = p_seller;
	}
	public Product() {
		super();
	}
	
	public Product(String p_email, String p_seller) {
		super();
		this.p_email = p_email;
		this.p_seller = p_seller;
	}
	public String getP_num() {
		return p_num;
	}
	public void setP_num(String p_num) {
		this.p_num = p_num;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	public String getP_producer() {
		return p_producer;
	}
	public void setP_producer(String p_producer) {
		this.p_producer = p_producer;
	}
	public String getP_text() {
		return p_text;
	}
	public void setP_text(String p_text) {
		this.p_text = p_text;
	}
	public String getP_img() {
		return p_img;
	}
	public void setP_img(String p_img) {
		this.p_img = p_img;
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	public String getP_seller() {
		return p_seller;
	}
	public void setP_seller(String p_seller) {
		this.p_seller = p_seller;
	}
	@Override
	public String toString() {
		return "Product [p_num=" + p_num + ", p_title=" + p_title + ", p_date=" + p_date + ", p_producer=" + p_producer
				+ ", p_text=" + p_text + ", p_img=" + p_img + ", p_email=" + p_email + ", p_seller=" + p_seller + "]";
	}
	

}