package com.xwork.dto;

import com.xwork.dto.dp.*;
import com.xwork.dto.dp.CraneDTO.ElevatorDTO;
import com.xwork.dto.dp.CraneDTO.ElevatorDTO.*;

public class ElevatorStarter {

	public static void main(String[] args) {
		CraneDTO crane = new CraneDTO();
		ElevatorDTO elevator = crane.new ElevatorDTO();
		elevator.setBrand(null);
		elevator.setCapacity(0);
		elevator.setNoOfperson(0);
		elevator.setType(null);
		elevator.setWorking(false);
		ElevatorDTO elevator1 = crane.new ElevatorDTO(null, 0, 0, null, false);
		ElevatorDTO elevator2 = crane.new ElevatorDTO(null, 0, 0, null, false);
		ElevatorDTO elevator3 = crane.new ElevatorDTO(null, 0, 0, null, false);
		ElevatorDTO elevator4 = crane.new ElevatorDTO(null, 0, 0, null, false);
	
		ElevatorDTO[] elev=new ElevatorDTO[9];
	elev[0]=elevator4 ;
	elev[1]=elevator1 ;
	elev[2]=elevator2 ;
	elev[6]=elevator4 ;
	for(int lift=0;lift<elev.length;lift++)
	{
		ElevatorDTO	refer=elev[lift];
		if(refer!=null)
		{
		System.out.println(refer.getBrand());
		System.out.println(refer.getCapacity());
		System.out.println(refer.getNoOfperson());
		System.out.println(refer.getType());
		System.out.println(refer.isWorking());
		System.err.println("@@@@@@@@@@");
	}
	else
	{
		
		System.err.println("index is pointing to null"
				.concat(String.valueOf(lift)));
	}
		
	}
	
	
	
	
	
	
	
	}

}
