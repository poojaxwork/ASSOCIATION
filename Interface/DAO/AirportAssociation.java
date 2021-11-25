package com.xwork.DAO;

import com.xwork.DTO.AirportDTO;

public class AirportAssociation {
	AirportDAO dao;

	public AirportAssociation(AirportDAO dao) {

		this.dao = dao;
	}

	void save(AirportDTO dto) {
		dao.save(dto);
	}

	void update(int indexNo, AirportDTO dto) {

		dao.update(indexNo, dto);
	}

	void delete(int indexNo) {

		dao.delete(indexNo);
	}
}
