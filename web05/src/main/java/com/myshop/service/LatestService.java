package com.myshop.service;

import java.util.List;


import com.myshop.dto.ProductDTO;


public interface LatestService {
	/* 최신 상품 */
	public List<ProductDTO> latestProducts() throws Exception;
	
	/* 베스트 상품 */
	public List<ProductDTO> bestProducts() throws Exception;
	
	/* 추천 상품 */
	public List<ProductDTO> chuProducts() throws Exception;
	
}