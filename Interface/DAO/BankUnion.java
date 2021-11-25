package com.xwork.DAO;

import com.xwork.DTO.BankDTO;

public class BankUnion {
	BankDAO dao;

	public BankUnion(BankDAO dao) {

		this.dao = dao;
	}

	public void save(BankDTO dto) {
		dao.save(dto);
	}

	public void delete(int index) {
		dao.delete(index);

	}

	public void update(int indexNo, BankDTO dto) {

		dao.update(indexNo, dto);
	}
}
