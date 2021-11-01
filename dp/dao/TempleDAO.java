package com.xwork.dp.dao;

import com.xwork.dp.dto.TempleDTO;

public class TempleDAO {
	private int count=0;
TempleDTO[] temple=new TempleDTO[6];
public void save(TempleDTO temp)
{
	System.out.println("TempleDAO is invoked from dto");
	if(this.count<this.temple.length)
	{
		
	this.temple[count++]=temp;
	System.out.println("Save :".concat(temp.getMainGod()));

}
	else
	{
		System.err.println("Save operation is failed");
	}
}

public void delete(int index)
{
	if(index>=0 &&  index<temple.length)
	{
		System.err.println("Delete is invoked");
		temple[index]=null;
		System.out.println("Delete is Successful"
				.concat(String.valueOf(index)));
		
		
	}
	else
	{
		
		System.err.println("Delete is failed".concat(String.valueOf(temple.length)));
	}
}
public void update(TempleDTO templedto,int no)
{
	if(no>=0 && no<temple.length)
	{
		this.temple[no]=templedto;
		
	}
	else
	{
		System.err.println("update is failed");
		
	}
}
public void display()
{
	for (int i = 0; i < temple.length; i++) {
		TempleDTO ref=temple[i];
		if (ref!=null) 
		{
			System.out.println(ref.getLocation());
			System.out.println(ref.getMainGod());
			System.out.println(ref.getName());
			System.out.println(ref.getNoOfpillars());
			System.out.println(ref.isPrasada());
			
		} 
		else {
System.err.println("Array is full ".concat(String.valueOf(i)));
		}
	
		
	



}}
}