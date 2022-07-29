package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.CartDAO;
import com.myshop.dto.CartDTO;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDAO cartDAO;
	
	@Override
	public List<CartDTO> cartList(String cid) throws Exception {
		return cartDAO.cartList(cid);
	}

	@Override
	public CartDTO cartRead(CartDTO cart) throws Exception {
		return cartDAO.cartRead(cart);
	}

	@Override
	public int cartCount() throws Exception {
		return cartDAO.cartCount();
	}

	@Override
	public void addCart(CartDTO cart) throws Exception {
		cartDAO.addCart(cart);
	}

	@Override
	public void deleteCart(CartDTO cart) throws Exception {
		cartDAO.deleteCart(cart);
	}

	@Override
	public void updateCart(CartDTO cart) throws Exception {
		cartDAO.updateCart(cart);
	}
}