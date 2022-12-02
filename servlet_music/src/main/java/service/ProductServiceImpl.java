package service;

import java.util.ArrayList;

import model.Product;
import productDao.ProductDao;
import productDao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	private ProductDao dao;
	public ProductServiceImpl() {
		this.dao= new ProductDaoImpl();
	}
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		dao.insert(p);
	}

	@Override
	public void editProduct(Product p) {
		// TODO Auto-generated method stub
		dao.update(p);
	}

	@Override
	public void delProduct(String p_title) {
		// TODO Auto-generated method stub
		dao.delete(p_title);
	}

	@Override
	public Product findProduct(String p_title) {
		// TODO Auto-generated method stub
		return dao.select(p_title);
	}

	@Override
	public ArrayList<Product> findAllByP_email(String p_email) {
		// TODO Auto-generated method stub
		return dao.selectAllByP_email(p_email);
	}

	@Override
	public ArrayList<Product> findAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}



}
