package com.xwork.dto;

import com.xwork.dto.dp.*;
import com.xwork.dto.dp.CraneDTO.SeasonDTO;

public class SeasonStarter {

	public static void main(String[] args) {
		CraneDTO crane = new CraneDTO();
		SeasonDTO refer = crane.new SeasonDTO();
		refer.setRainy(false);
		refer.setHumidity(27.4f);
		refer.setSeason("Summer");
		refer.setSeasonalFruit("MANGO");
		refer.setTemperature(40.5f);
		refer.setType("too hot");
		refer.setWeather(false);
		SeasonDTO refer1 = crane.new SeasonDTO("Spring", null, 0, 0, null, false, false);
		SeasonDTO refer2 = crane.new SeasonDTO("Winter", null, 0, 0, null, false, false);
		SeasonDTO refer3 = crane.new SeasonDTO("Rainy", null, 0, 0, null, false, false);

		SeasonDTO[] season = new SeasonDTO[9];
		season[0] = refer;
		season[1] = refer1;
		season[8] = refer3;
		season[2] = refer3;
		for (int sea = 0; sea < season.length; sea++) {
			SeasonDTO ref = season[sea];
			if (ref != null) {
				System.out.println(ref.getHumidity());
				System.out.println(ref.getSeason());
				System.out.println(ref.getSeasonalFruit());
				System.out.println(ref.getTemperature());
				System.out.println(ref.getType());
				System.out.println(ref.isRainy());
				System.out.println(ref.isWeather());
				System.err.println("*********");

			} else {

				System.err.println("Array is pointing to null".concat(String.valueOf(sea)));
			}

		}

	}

}
