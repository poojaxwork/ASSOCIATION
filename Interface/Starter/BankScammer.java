package com.xwork.Starter;

import com.xwork.DAO.BankDAO;
import com.xwork.DAO.BankDetails;
import com.xwork.DAO.BankUnion;
import com.xwork.DTO.BankDTO;

public class BankScammer {

	public static void main(String[] args) {
		BankDTO dto = new BankDTO("K19822u24W", "SBI", "SBB1929293", "Tumkur");
		BankDTO dto1 = new BankDTO("K19822u24W", "Canara", "SBB1929293", "Tumkur");
		BankDTO dto2 = new BankDTO("K19822u24W", "Union", "SBB1929293", "Tumkur");
		BankDAO ref = new BankDetails();
		BankUnion bank = new BankUnion(ref);
		ref.delete(2);
		ref.save(dto2);
		ref.save(dto);
		ref.save(dto2);
		ref.update(5, dto2);
		ref.display();
	}

}
