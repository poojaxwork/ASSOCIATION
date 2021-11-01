package com.xwork.dp.dao;

import com.xwork.dp.dto.DressCodeDTO;

public class DressCodeDAO {
	
	DressCodeDTO[] dto=new DressCodeDTO[5];
	private int count;
	
	public DressCodeDAO() {
		System.out.println("Dress DAO is invoked:");
	}
	public void save(DressCodeDTO dress,int index) 
	{
		if(count<this.dto.length && index<dto.length && index!=0) {
			 dto[count++]=dress ;
			 System.out.println("Entered value is" .concat(dress.getColor()));
					 
			 
		}
		else
		{
			System.err.println("cointer is null".concat(String.valueOf(this.dto.length)));
			
		}
	}
	
public DressCodeDTO[] getValues()
{
	return this.dto;
}
public void delete(int index)
{
	
if(index>=0 && index<dto.length)
{
	System.out.println("Delete is invoked");
	dto[index]=null;

}
else
{
	
System.err.println("delete is not possible");
}

}
public void update(DressCodeDTO updatedName,int indexN0)
{
	
	if (indexN0>=0 && indexN0<dto.length) {
		System.out.println("update is invoked");
		dto[indexN0]=updatedName;
	}
	else
	{
		System.err.println("Update is failed");
		
	}

}
}
