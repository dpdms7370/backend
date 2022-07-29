package com.myshop.dao;

import java.util.List;

import com.myshop.dto.CartDTO;

public interface CartDAO {
	public List<CartDTO> cartList(String cid) throws Exception;
	public CartDTO cartRead(CartDTO cart) throws Exception; 
	public int cartCount() throws Exception;
	public void addCart(CartDTO cart) throws Exception;
	public void deleteCart(CartDTO cart) throws Exception;
	public void updateCart(CartDTO cart) throws Exception;
}