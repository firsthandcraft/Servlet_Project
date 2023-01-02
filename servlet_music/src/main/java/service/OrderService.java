package service;

import java.util.ArrayList;

import model.Order;

public interface OrderService {
	void addOrder(Order o);
	Order getOrder(String o_num);
	ArrayList<Order> orderList(String o_mno,String o_state);
	void editState(String o_num);
	void delOrder(String o_num);
}
