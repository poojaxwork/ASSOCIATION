package com.xwork.dto.dp;

import com.xwork.dto.dp.*;
import com.xwork.dto.dp.CraneDTO.BusDriverDTO;

public class BusStarter {

	public static void main(String[] args) {
		CraneDTO crane = new CraneDTO();
		BusDriverDTO bus = crane.new BusDriverDTO();
		bus.setAge(0);
		bus.setBusType(null);
		bus.setDlId(null);
		bus.setName(null);
		bus.setSalary(0);
		bus.setType(null);
		bus.setWork(false);
		BusDriverDTO bus1 = crane.new BusDriverDTO(null, 0, null, null, null, 0, false);
		BusDriverDTO bus2 = crane.new BusDriverDTO(null, 0, null, null, null, 0, false);
		BusDriverDTO bus3 = crane.new BusDriverDTO(null, 0, null, null, null, 0, false);

		BusDriverDTO[] busarray = new BusDriverDTO[9];
		busarray[0] = bus1;
		busarray[3] = bus;
		busarray[8] = bus2;
		for (int cool = 0; cool < busarray.length; cool++) {

			BusDriverDTO buss = busarray[cool];
			if (buss != null) {
				System.out.println(buss.getAge());
				System.out.println(buss.getBusType());
				System.out.println(buss.getDlId());
				System.out.println(buss.getName());
				System.out.println(buss.getType());
				System.out.println(buss.isWork());
				System.out.println(buss.getSalary());
				System.err.println("$$$$$$$$$");

			} else {

				System.err.println("index is pointing to null".concat(String.valueOf(cool)));
			}

		}
	}

}
