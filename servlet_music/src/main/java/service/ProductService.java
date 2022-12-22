package service;

import java.util.ArrayList;

import model.Product;

public interface ProductService {
	void addProduct(Product p);
	void editProduct(Product p);
	void editProductMembershipPlan(Product p);
	void delProduct(String p_title);
	Product findProduct(String p_title);
	ArrayList<Product> findAllByP_email(String p_email);
	ArrayList<Product> findAll();
	ArrayList<Product> searchProduct(String p_title);
	
}
