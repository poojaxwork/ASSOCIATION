package com.xwork.dto;

import com.xwork.dto.dp.*;
import com.xwork.dto.dp.CraneDTO;
import com.xwork.dto.dp.CraneDTO.CarpenterDTO;

public class CarpenterStarter {

	public static void main(String[] args) {
		CraneDTO crane = new CraneDTO();
		CarpenterDTO carpenter = crane.new CarpenterDTO();
		carpenter.setAddress("Banglore");
		carpenter.setCharges(5000.5f);
		carpenter.setGoodWorker(false);
		carpenter.setName("XX");
		carpenter.setPhoneNo(9888076454l);
		carpenter.setService("furnitures");
		carpenter.setWorkingHours("9am-7pm");

		CarpenterDTO carpenter1 = crane.new CarpenterDTO("oo", 0, null, 0, null, null, false);
		CarpenterDTO carpenter2 = crane.new CarpenterDTO("mmm", 0, null, 0, null, null, false);
		CarpenterDTO carpenter3 = crane.new CarpenterDTO("nnn", 0, null, 0, null, null, false);

		CarpenterDTO[] refer = new CarpenterDTO[9];
		refer[0] = carpenter;
		refer[2] = carpenter1;
		refer[8] = carpenter1;
		refer[3] = carpenter1;
		refer[4] = carpenter1;
		for (int car = 0; car < refer.length; car++) {
			CarpenterDTO carpen = refer[car];
			if (carpen != null) {
				System.out.println(carpen.getAddress());
				System.out.println(carpen.getCharges());
				System.out.println(carpen.getName());
				System.out.println(carpen.getPhoneNo());
				System.out.println(carpen.getService());
				System.out.println(carpen.getWorkingHours());
				System.out.println(carpen.isGoodWorker());
				System.err.println("$$$$$$$$$$$$");

			} else {
				System.err.println("array is pointing to null".concat(String.valueOf(car)));

			}
		}

	}

}
