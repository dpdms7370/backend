package com.myshop.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.PaymentDAO;
import com.myshop.dto.PaymentDTO;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentDAO paymentDAO;

	@Override
	public List<PaymentDTO> paymentList(String cid) throws Exception {
		// TODO Auto-generated method stub
		return paymentDAO.paymentList(cid);
	}

	@Override
	public PaymentDTO paymentRead(int paynum) throws Exception {
		// TODO Auto-generated method stub
		return paymentDAO.paymentRead(paynum);
	}

	@Override
	public int paymentCount(String cid) throws Exception {
		// TODO Auto-generated method stub
		return paymentDAO.paymentCount(cid);
	}

	@Override
	public void addPayment(PaymentDTO payment) throws Exception {
		paymentDAO.addPayment(payment);
		
	}

	@Override
	public void addShopping(PaymentDTO payment) throws Exception {
		// TODO Auto-generated method stub
		paymentDAO.addShopping(payment);
	}

	@Override
	public void deletePayment(PaymentDTO payment) throws Exception {
		// TODO Auto-generated method stub
		paymentDAO.deletePayment(payment);
	}

	@Override
	public void updatePayment(PaymentDTO payment) throws Exception {
		// TODO Auto-generated method stub
		paymentDAO.updatePayment(payment);
	}

	
	


}
