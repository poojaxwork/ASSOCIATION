package com.xwork.dp;

import com.xwork.dp.dao.DressCodeDAO;
import com.xwork.dp.dto.DressCodeDTO;
import com.xwork.dp.dto.Size;


public class DressCodeStarter {

	public static void main(String[] args) {
		DressCodeDTO dtoref=new DressCodeDTO(Size.MEDIUM, "Denim", "blue", 2000, "female");
		dtoref.getColor();
		DressCodeDTO dtoref1=new DressCodeDTO(Size.MEDIUM, "cotton", "black", 2000, "female");
		DressCodeDTO dtoref2=new DressCodeDTO(Size.MEDIUM, "Satin", "red", 2000, "female");
		DressCodeDTO dtoref3=new DressCodeDTO(Size.MEDIUM, "Synthetic", "navy blue", 2000, "female");

		DressCodeDAO dao=new DressCodeDAO();
		
		dao.save(dtoref,1);
		
		DressCodeDTO[] refer =dao.getValues();
	//	refer[0]=dtoref;
		//refer[1]=dtoref1;
		//refer[2]=dtoref2;
		//refer[3]=dtoref3;
		
		dao.save(dtoref2,4);
		
		System.err.println("Arayy elements are displaying:");
		
		for (int no = 0; no < refer.length; no++) {
			
			DressCodeDTO obj= refer[no];
			if (obj != null)
			{
				System.out.println(obj.getColor());
				System.out.println(obj.getGender());
				System.out.println(obj.getMaterial());
				System.out.println(obj.getPrice());
				System.out.println(obj.getSize());
				System.err.println("$$$$$");
		}
			
		else 
		{
			System.err.println
			("Array index is not initialized".concat(String.valueOf(no)));
		}
	}
		
}}
