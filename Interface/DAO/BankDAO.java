package com.xwork.DAO;

import com.xwork.DTO.AirportDTO;
import com.xwork.DTO.BankDTO;

public interface BankDAO {
	void save(BankDTO dto);

	void update(int index, BankDTO dto);

	void delete(int index);

	void display();
}
