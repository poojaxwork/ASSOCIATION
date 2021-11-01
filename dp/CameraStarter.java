package com.xwork.dp;

import com.xwork.dp.dao.CameraDAO;
import com.xwork.dp.dto.CameraDTO;

public class CameraStarter {

	public static void main(String[] args) {
		
		CameraDTO dto=new CameraDTO("Nikon", "digital", "567*676 pixel",500.09f, 688.9f, 500.9f);
		CameraDTO dto1=new CameraDTO("Canon", "digital", "567*676 pixel",500.09f, 688.9f, 500.9f);
		CameraDTO dto2=new CameraDTO("DSLR", "HD", "567*676 pixel",500.09f, 688.9f, 500.9f);
		CameraDAO dao=new CameraDAO();
		dao.addElements(dto2,0);
		dao.update(dto, 3);
		dao.delete(10);
		boolean result=dao.matchType("DSLR");
		System.out.println(result);
		 CameraDTO[] ref=dao.getDisplay();
		 dao.addElements(dto2,1);
		 dao.addElements(dto1,3);
		 dao.addElements(dto2,4);
		 for(int newton=0;newton<ref.length;newton++)
		 {
			 CameraDTO dtoref=ref[newton];
			 if(dtoref!=null)
			 {
				 System.out.println("invoked display method");
				 System.out.println(dtoref.getBatteryCapacity());
				 System.out.println(dtoref.getCompany());
				 System.out.println(dtoref.getPixel());
				 System.out.println(dtoref.getType());
				 System.out.println(dtoref.getPrice());
			 System.out.println(dtoref.getWeight());
			 System.err.println("$$$$$$$$$$$$$$");
			 }
			 else
			 {
				 System.out.println("index is full".concat(String.valueOf(newton)));
				 
			 }
			 
			
		 }
	
	dao.indexFilled();
	
	}

}
