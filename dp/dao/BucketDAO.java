package com.xwork.dp.dao;

import com.xwork.dp.dto.BucketDTO;

public class BucketDAO {
	BucketDTO[] bucketdtos=new BucketDTO[7];
	private int count;
	
	public  void create(BucketDTO dto) 
	{
		System.out.println("Create method is invoked");
		if(this.count<this.bucketdtos.length && dto!=null)
		{
			bucketdtos[count++]=dto;
			
			System.out.println("Created value is:".concat(dto.getCompany()));
		}
		else
		{
			System.out.println("Array is full".concat(String.valueOf(bucketdtos.length)));
			
		}
	}
	public void create(BucketDTO dto,int index)
	{
		System.out.println("create overloaded method is invoked");
		if(index>=0 && dto!=null && index<bucketdtos.length)
		{
			
			bucketdtos[index]=dto;
			
			
		}
		else
		{
			System.out.println("index entered is invalid".concat(String .valueOf(bucketdtos.length)));
			
		}
		
	}

}
