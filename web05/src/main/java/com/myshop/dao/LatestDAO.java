package com.myshop.dao;

import java.util.List;

import com.myshop.dto.ProductDTO;

public interface LatestDAO {
	/* 최신 상품 */
	public List<ProductDTO> latestProducts() throws Exception;
	
	/* 베스트 상품 */
	public List<ProductDTO> bestProducts() throws Exception;
	
	/* 추천 상품 */
	public List<ProductDTO> chuProducts() throws Exception;
	
	/* 최신 게시글 */
}
