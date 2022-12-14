package com.myshop.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dto.MemberDTO;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ServiceTest2 {

	@Autowired
	DAOTest2 daoTest;
	
	@Test
	public void test() {
		log.info("Service Test~!");
	}
	
	public List<MemberDTO> sampleList(){
		return daoTest.sampleList();
	}
	
	public int sampleCount(){
		return daoTest.sampleCount();
	}
}