package OrderDao;

import java.util.ArrayList;

import model.Order;

public interface OrderDao {
	void insert(Order o);
	Order select(String o_num);
	ArrayList<Order> selectAll(String o_mno);
	void delete(String o_num);
	void update(String o_num);
}
