package com.xwork.Starter;

import com.xwork.DAO.BusAssociation;
import com.xwork.DAO.BusDAOArray;
import com.xwork.DAO.BusRouteDAO;
import com.xwork.DTO.BusRouteDTO;

public class BusStarter {

	public static void main(String[] args) {
		BusRouteDTO ref = new BusRouteDTO("A19876543F", "Shimoga", "Hassan", "Ram");
		BusRouteDTO ref1 = new BusRouteDTO("B19876543F", "Tumkur", "Shimoga", "Shravan");
		BusRouteDTO ref2 = new BusRouteDTO("O19876543F", "Mysore", "Belur", "Pavan");

		BusRouteDAO dao = new BusDAOArray();
		BusAssociation refer = new BusAssociation(dao);

		refer.save(ref2);
		refer.save(ref1);
		refer.save(ref);
		refer.dispaly();
		refer.update(4, ref);
		refer.dispaly();
		refer.delete(10);
		refer.dispaly();
	}

}
