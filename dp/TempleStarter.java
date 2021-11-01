package com.xwork.dp;

import com.xwork.dp.dao.TempleDAO;
import com.xwork.dp.dto.TempleDTO;

public class TempleStarter {

	public static void main(String[] args) {
		TempleDTO tempdto = new TempleDTO("Belur Temple", "Hassan", "Chenakeshava", false, 1000);
		TempleDTO tempdto1 = new TempleDTO("Durga Temple", "West Bengal", "Durga", false, 400);
		TempleDTO tempdto2 = new TempleDTO("Iskon Temple", "Banglore", "Krishna", false, 30);
		TempleDAO dao = new TempleDAO();
dao.save(tempdto);
		dao.delete(5);
		dao.update(tempdto2, 1);
		dao.display();

	}

}
