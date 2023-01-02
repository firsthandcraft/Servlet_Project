package service;

import java.util.ArrayList;

import OrderDao.OrderDao;
import OrderDao.OrderDaoImpl;
import model.Order;

public class OrderServiceImpl implements OrderService{
	private OrderDao dao;
	public OrderServiceImpl() {
		dao=new OrderDaoImpl();
	}
	@Override
	public void addOrder(Order o) {
		// TODO Auto-generated method stub
		dao.insert(o);
	}

	@Override
	public Order getOrder(String o_num) {
		// TODO Auto-generated method stub
		return dao.select(o_num);
	}

	@Override
	public ArrayList<Order> orderList(String o_mno, String o_state) {
		// TODO Auto-generated method stub
		return dao.selectAll(o_mno, o_state);
	}

	@Override
	public void editState(String o_num) {
		// TODO Auto-generated method stub
		dao.update(o_num);
	}

	@Override
	public void delOrder(String o_num) {
		// TODO Auto-generated method stub
		dao.delete(o_num);
	}

}
