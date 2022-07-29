package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.PaymentDTO;

@Repository
public class PaymentDAOImpl implements PaymentDAO{

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<PaymentDTO> paymentList(String cid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("payment.paymentList",cid);
	}

	@Override
	public PaymentDTO paymentRead(int paynum) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("payment.salesRead",paynum);
	}

	@Override
	public int paymentCount(String cid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("payment.paymentCount",cid);
	}

	@Override
	public void addPayment(PaymentDTO payment) throws Exception {
		
		sqlSession.insert("payment.addPayment",payment);
	}

	@Override
	public void addShopping(PaymentDTO payment) throws Exception {
		sqlSession.update("payment.addShopping",payment);
		
	}

	@Override
	public void deletePayment(PaymentDTO payment) throws Exception {
		sqlSession.delete("payment.deletePayment",payment);
		
	}

	@Override
	public void updatePayment(PaymentDTO payment) throws Exception {
		sqlSession.update("payment.updatePayment",payment);
		
	}

	

	
}
