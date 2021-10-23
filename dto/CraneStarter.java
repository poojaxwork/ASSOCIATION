package com.xwork.dto;

import com.xwork.dto.dp.CraneDTO;

public class CraneStarter {

	public static void main(String[] args) {
		
CraneDTO crane=new CraneDTO();
crane.setAqatic(false);
crane.setColor("white");
crane.setHeight(3.8f);
crane.setName(null);
crane.setScientificName("Gruidae");
//crane.setSeason("Spring");
//crane.setMigrate(false);
CraneDTO crane1=new CraneDTO(null, 3.9f, "Gruidae", "Grey", false, false);
CraneDTO crane2=new CraneDTO(null, 4.9f, "Gruidae", "Grey", false, false);
CraneDTO crane3=new CraneDTO(null, 3.9f, "Gruidae", "Black", false, false);

//Grouping of array
CraneDTO[] craneref=new CraneDTO[7];
craneref[1]=crane;
craneref[2]=crane1;
craneref[0]=crane3;
for (int no = 0; no < craneref.length; no++) {
	
	CraneDTO ref=craneref[no];
	if(ref!=null)
	{
	System.out.println(ref.getColor());
	System.out.println(ref.getHeight());
	System.out.println(ref.getName());
	System.out.println(ref.getScientificName());
	System.out.println(ref.getSeason());
	System.out.println(ref.isAqatic());
	System.out.println(ref.isMigrate());
		System.err.println("$$$$$$$$$$$");
	}

else
{
System.out.println("Array size limit is reached".concat(String.valueOf(no)));	
}}

	}
	
	
}
