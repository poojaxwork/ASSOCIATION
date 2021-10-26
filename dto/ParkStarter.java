package com.xwork.dto;
import com.xwork.dto.dp.*;
import com.xwork.dto.dp.CraneDTO.ParkDTO;

public class ParkStarter {

	public static void main(String[] args) {
		
			CraneDTO crane=new CraneDTO();
			ParkDTO park=crane.new ParkDTO();
			System.out.println(park.setOpenTime(0));
			System.out.println();
			System.out.println(park.setName(null));
			System.out.println(park.setNoOftrees(0));
			System.out.println(park.setOpenTime(0));
			System.out.println(park.setPrice(0));

	}

}
