package com.myshop.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myshop.dao.ProductDAO;
import com.myshop.dto.CategoryDTO;
import com.myshop.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public List<ProductDTO> productList() throws Exception {
		// TODO Auto-generated method stub
		return productDAO.productList();
	}

	@Override
	public ProductDTO getProduct(int num) throws Exception {
		// TODO Auto-generated method stub
		return productDAO.getProduct(num);
	}

	@Override
	public int productCount() throws Exception {
		// TODO Auto-generated method stub
		return productDAO.productCount();
	}

	@Override
	public void addProduct(ProductDTO product) throws Exception {
		// TODO Auto-generated method stub
		productDAO.addProduct(product);
	}

	@Override
	public void deleteProduct(ProductDTO product) throws Exception {
		// TODO Auto-generated method stub
		productDAO.deleteProduct(product);
	}

	@Override
	public void updateProduct(ProductDTO product) throws Exception {
		// TODO Auto-generated method stub
		productDAO.updateProduct(product);
	}

	@Override
	public void addCategory(CategoryDTO category) throws Exception {
		// TODO Auto-generated method stub
		productDAO.addCategory(category);
	}

	
	
	


}
