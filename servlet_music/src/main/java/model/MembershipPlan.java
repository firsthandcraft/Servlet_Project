package model;
//¿ä±ÝÁ¦
public class MembershipPlan {
	private String buyer;
	private String seller;
	public MembershipPlan(String buyer, String seller) {
		super();
		this.buyer = buyer;
		this.seller = seller;
	}
	public MembershipPlan() {
		super();
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	@Override
	public String toString() {
		return "MembershipPlan [buyer=" + buyer + ", seller=" + seller + "]";
	}
}
