package model;

import java.util.Date;

public class Order {
private String o_num;
private String o_pnum;
private String o_mno;
private Date o_date;
private String o_state;//주문상태 주문 혹은 ...장바구니는 필요 없군
private String d_state;
public Order(String o_num, String o_pnum, String o_mno, Date o_date, String o_state, String d_state) {
	super();
	this.o_num = o_num;
	this.o_pnum = o_pnum;
	this.o_mno = o_mno;
	this.o_date = o_date;
	this.o_state = o_state;
	this.d_state = d_state;
}
public Order() {
	super();
}
public String getO_num() {
	return o_num;
}
public void setO_num(String o_num) {
	this.o_num = o_num;
}
public String getO_pnum() {
	return o_pnum;
}
public void setO_pnum(String o_pnum) {
	this.o_pnum = o_pnum;
}
public String getO_mno() {
	return o_mno;
}
public void setO_mno(String o_mno) {
	this.o_mno = o_mno;
}
public Date getO_date() {
	return o_date;
}
public void setO_date(Date o_date) {
	this.o_date = o_date;
}
public String getO_state() {
	return o_state;
}
public void setO_state(String o_state) {
	this.o_state = o_state;
}
public String getD_state() {
	return d_state;
}
public void setD_state(String d_state) {
	this.d_state = d_state;
}
@Override
public String toString() {
	return "Order [o_num=" + o_num + ", o_pnum=" + o_pnum + ", o_mno=" + o_mno + ", o_date=" + o_date + ", o_state="
			+ o_state + ", d_state=" + d_state + "]";
}

}
