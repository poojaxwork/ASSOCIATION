package com.xwork.dp.dao;

import com.xwork.dp.dto.IplDTO;

public class IplDAO {
IplDTO[]  ipldtos=new IplDTO[8];
private int octopus;
 
 
public void create(IplDTO dto)
{
	System.out.println("Create is invoked");
if( this.octopus<this.ipldtos.length && this.octopus>=0 && dto!=null)
{
 this.ipldtos[octopus++]=dto;
 System.out.println("Saved value : ".concat(dto.getTeamName()));

}
}
 public void create(IplDTO dto1,int index)
 {
	 System.out.println("Create overloaded method is invoked");
	 if(index>=0 && index<ipldtos.length && dto1!=null)
	 {
		 System.out.println("invoked  create".concat(dto1.getTeamName()));
		ipldtos[index]=dto1; 
		System.out.println("Index stored :".concat(String.valueOf(index)));
	 }
 }
	 
public int indexOccupied()
{
System.out.println(" no of Index with values are:".concat(String.valueOf(octopus)));	
return octopus;

}

public boolean matchTeam(String name)
{
	System.out.println(" invoked Match method is invoked:");
	System.out.println("TeamName passed".concat(name));
	for(int i=0;i<ipldtos.length;i++)
	{
		 IplDTO reference=this.ipldtos[i];
		 if(reference!=null)
		 {
			 System.out.println("ref in index is not null".concat(String.valueOf(i)));
			 String refName=reference.getTeamName();
			 System.out.println("matching".concat(refName));
			if(name.equals(refName));
			{
				System.out.println("Matched");
				return true;
			}}}
			
		 
return false;

}}
