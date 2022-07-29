package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.CartDTO;

@Repository
public class CartDAOImpl implements CartDAO {

	@Autowired
	SqlSession sqlSession; 
	
	@Override
	public List<CartDTO> cartList(String cid) throws Exception {
		return sqlSession.selectList("cart.cartList",cid);
	}

	@Override
	public CartDTO cartRead(CartDTO cart) throws Exception {
		return sqlSession.selectOne("cart.cartRead", cart);
	}

	@Override
	public int cartCount() throws Exception {
		return sqlSession.selectOne("cart.cartCount");
	}

	@Override
	public void addCart(CartDTO cart) throws Exception {
		sqlSession.insert("cart.addCart", cart);
	}

	@Override
	public void deleteCart(CartDTO cart) throws Exception {
		sqlSession.delete("cart.deleteCart", cart);
	}

	@Override
	public void updateCart(CartDTO cart) throws Exception {
		sqlSession.update("cart.updateCart", cart);
	}
}