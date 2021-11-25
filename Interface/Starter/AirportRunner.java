package com.xwork.Starter;

import com.xwork.DAO.AirportArrayDAO;
import com.xwork.DAO.AirportAssociation;
import com.xwork.DAO.AirportDAO;
import com.xwork.DTO.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO dto1 = new AirportDTO("H29299292W", "Kempegowda Airport", "Banglore", "Domestic");
		AirportDTO dto2 = new AirportDTO("H29299292W", "Manglore Airport", "Banglore", "Domestic");
		AirportDTO dto3 = new AirportDTO("H29299292W", "Mumbai Airport", "Banglore", "Domestic");

		AirportDAO dao = new AirportArrayDAO();
		AirportAssociation ref = new AirportAssociation(dao);
		dao.save(dto3);
		dao.save(dto1);
		dao.save(dto2);
		dao.delete(3);
		dao.update(1, dto2);
		dao.display();

	}

}
