//package com.myshop.dao;
//
//import java.util.List;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.myshop.dto.ProductDTO;
//
//@Repository
//public class LatestDAOImpl implements LatestDAO {
//	
//	@Autowired
//	SqlSession sqlSession;
//
//	@Override
//	public List<ProductDTO> latestProducts() throws Exception {
//		// TODO Auto-generated method stub
//		return;
//	}
//
//	@Override
//	public List<ProductDTO> bestProducts() throws Exception {
//		// TODO Auto-generated method stub
//		return;
//	}
//
//	@Override
//	public List<ProductDTO> chuProducts() throws Exception {
//		// TODO Auto-generated method stub
//		return sqlSession.selectList(chuProducts());
//	}
//}