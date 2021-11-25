package com.xwork.DAO;

import com.xwork.DTO.AirportDTO;
import com.xwork.DTO.BankDTO;

public class BankDetails implements BankDAO {
	BankDTO[] bankdto = new BankDTO[6];
	private int count;

	@Override
	public void save(BankDTO dto) {
		if (count < bankdto.length) {
			bankdto[count++] = dto;

			System.out.println("Save:".concat(String.valueOf(dto.getBranch())));
		}
	}

	@Override
	public void update(int index, BankDTO dto) {
		if (index >= 0 && index < bankdto.length) {
			bankdto[index] = dto;
		} else {

			System.err.println("update is failed");
		}
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		for (int i = 0; i < bankdto.length; i++) {
			BankDTO refer = bankdto[i];
			if (refer != null) {
				System.out.println(refer.getBranch());
				System.out.println(refer.getId());
				System.out.println(refer.getIfsc());
				System.out.println(refer.getName());
			}

		}
	}
}
