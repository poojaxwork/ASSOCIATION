package com.xwork.DAO;

import com.xwork.DTO.BusRouteDTO;

public class BusDAOArray implements BusRouteDAO {
	private BusRouteDTO[] busDTO = new BusRouteDTO[5];
	private int count;

	@Override
	public void dispaly() {

		for (int bus = 0; bus < busDTO.length; bus++)

		{

			BusRouteDTO refer = busDTO[bus];
			if (refer != null) {
				System.out.println(refer.getDestination());
				System.out.println(refer.getDriverName());
				System.out.println(refer.getId());
				System.out.println(refer.getStartPoint());

			} else {
				System.err.println("index is not assigned with value".concat(String.valueOf(bus)));
			}
		}

	}

	@Override
	public boolean delete(int index) {
		if (index >= 0 && index < busDTO.length) {
			busDTO[index] = null;
			return true;

		}

		return false;
	}

	@Override
	public int update(int index, BusRouteDTO name) {
		if (name != null && index >= 0 && index < busDTO.length) {
			busDTO[index] = name;
			return 1;
		}

		return 0000;
	}

	@Override
	public void save(BusRouteDTO bus) {
		if (count < busDTO.length) {
			busDTO[count++] = bus;
			System.out.println("Added data is:".concat(String.valueOf(bus.getDriverName())));
		}

	}

}
