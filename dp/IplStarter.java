package com.xwork.dp;

import com.xwork.dp.dao.IplDAO;
import com.xwork.dp.dao.IplDAO.*;
import com.xwork.dp.dto.IplDTO;

public class IplStarter {
	 public static void main(String[] args) {
		 IplDTO dtos=new IplDTO("RCB", 5, 10, "USL", "VIVO");
		 IplDTO dtos1=new IplDTO("MI", 5, 10, "USL", "VIVO");
			IplDAO dao=new IplDAO();
			dao.create(dtos1);//either we can pass reference of constructor or null
			dao.create(dtos);
			dao.create(null);
			dao.indexOccupied();
			dao.create(dtos1, 2);
			 boolean result=dao.matchTeam("MI");//store it in boolean to get true/f
			 System.out.println(result);
	}
}
	
