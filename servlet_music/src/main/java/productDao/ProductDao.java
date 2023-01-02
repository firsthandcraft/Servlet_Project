package productDao;

import java.util.ArrayList;

import model.Product;

public interface ProductDao {
	
	void insert(Product p);
	void update(Product p);
	void updateMembershipPlan(Product p);
	void delete(String p_title);
	ArrayList<Product> selectAllByP_email(String p_email);
	Product select(String p_num);
	ArrayList<Product> selectAll();
	ArrayList<Product> selectProduct(String p_title);
	//void updateP(int q, int num);
}
 