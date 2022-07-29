package com.myshop.dao;

import java.util.List;

import com.myshop.dto.PaymentDTO;

public interface PaymentDAO {
	
	public List<PaymentDTO> paymentList(String cid) throws Exception;
	public PaymentDTO paymentRead(int paynum) throws Exception;
	public int paymentCount(String cid) throws Exception;
	public void addPayment(PaymentDTO payment) throws Exception;
	public void addShopping(PaymentDTO payment) throws Exception;
	public void deletePayment(PaymentDTO payment) throws Exception;
	public void updatePayment(PaymentDTO payment) throws Exception;

}
