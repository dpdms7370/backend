package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.CategoryDTO;
import com.myshop.dto.ProductDTO;

@Repository
public class ProductDAOImpl  implements ProductDAO{
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<ProductDTO> productList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.productList");
	}

	@Override
	public ProductDTO getProduct(int num) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.getproduct", num);
	}

	@Override
	public int productCount() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.productcount");
	}

	@Override
	public void deleteProduct(ProductDTO product) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete("product.deleteProduct",product);
	}

	@Override
	public void addProduct(ProductDTO product) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("product.addProduct",product);
	}

	@Override
	public void addCategory(CategoryDTO product) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("product.addCategory",product);
	}

	@Override
	public void updateProduct(ProductDTO product) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("product.updateProduct",product);
	}

	
}
