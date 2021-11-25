package com.xwork.DAO;

import com.xwork.DTO.AirportDTO;

public interface AirportDAO {
	void save(AirportDTO dto);

	void update(int index, AirportDTO dto);

	void delete(int index);

	void display();
}
