package com.myshop.service;

import java.util.List;

import com.myshop.dto.CartDTO;

public interface CartService {
	public List<CartDTO> cartList(String cid) throws Exception;
	public CartDTO cartRead(CartDTO cart) throws Exception; 
	public int cartCount() throws Exception;
	public void addCart(CartDTO cart) throws Exception;
	public void deleteCart(CartDTO cart) throws Exception;
	public void updateCart(CartDTO cart) throws Exception;
}
