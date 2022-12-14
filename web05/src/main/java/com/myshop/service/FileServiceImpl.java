package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.FileDAO;
import com.myshop.dto.DatabankDTO;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	FileDAO fileDAO;

	@Override
	public void databankInsert(DatabankDTO databank) throws Exception {
		fileDAO.databankInsert(databank);	
	}

	@Override
	public List<DatabankDTO> databankList() throws Exception {
		return fileDAO.databankList();
	}
}