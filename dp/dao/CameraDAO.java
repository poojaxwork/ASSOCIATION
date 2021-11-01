package com.xwork.dp.dao;

import com.xwork.dp.dto.CameraDTO;

public class CameraDAO {
	CameraDTO[] cameradto=new CameraDTO[6];
	private int count;
	public void addElements(CameraDTO dto,int index)
	{
		if(this.count<cameradto.length && dto!=null)
		{
			cameradto[count++]=dto;
			System.out.println("added Element:".concat(dto.getCompany()).concat(String.valueOf(index)));
		}
		else
		{
			System.err.println("Index is not pointing to any m/y location"
					.concat(String.valueOf(cameradto.length)));
		}
	}
 public void update(CameraDTO dto,int indexNo)
{
	if(indexNo>=0 && indexNo<cameradto.length && dto!=null)
	{
		cameradto[indexNo]=dto;
		System.out.println("Updated value is".concat(String.valueOf(indexNo)));
	}
	else
	{
		
		System.err.println("update is failed,limit is reached"
				.concat(String.valueOf(cameradto.length)));
	}
}
 public CameraDTO[] getDisplay()
 {
	 return this.cameradto;
	 
	 
 }
 public void delete(int index)
 
 {
	 if(index>=0 && index<cameradto.length)
	 {
		 System.out.println("Delte is invoked");
		 cameradto[index]=null;
		 System.out.println("deleted index:".concat(String.valueOf(index)));
		 
	 }
	 else
	 {
		 System.err.println("delete is failed".concat(String.valueOf(cameradto.length)));
	 }
	 

 }
 public int  indexFilled()
 {
	 System.err.println("index filled".concat(String.valueOf(count)));
	 
	return count; 
 }
 public boolean matchType(String brand)
 {
	 System.out.println("Entered name".concat(brand));
	 for(int raman=0;raman<cameradto.length;raman++)
	 {
		 CameraDTO refer=cameradto[raman];
		 if(refer!=null) 
		 {
			 String referName=refer.getCompany();
			 System.out.println("matching brand".concat(referName));
			 if(brand.equals(referName))
			 {
				 System.out.println("Matched".concat(String.valueOf(true)));
				 
			 }
			 else {
				 System.err.println("NO Match");
			 }
		 }
		 
	 }
	 
	 
 
return false;	 
 }
}
