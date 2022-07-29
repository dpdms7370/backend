package com.myshop.dao;


import java.util.List;

import com.myshop.dto.CategoryDTO;
import com.myshop.dto.ProductDTO;

public interface ProductDAO {
	
	public List<ProductDTO> productList() throws Exception;
	public ProductDTO getProduct(int num) throws Exception;
	public int productCount() throws Exception;
	public void addProduct(ProductDTO product) throws Exception;
	public void deleteProduct(ProductDTO product) throws Exception;
	public void updateProduct(ProductDTO product) throws Exception;
	public void addCategory(CategoryDTO category) throws Exception;

}


