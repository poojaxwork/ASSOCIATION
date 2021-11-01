package com.xwork.dp.dao;

import com.xwork.dp.dto.ApplicationDTO;
import com.xwork.dp.dto.FacebookApplicationDTO;
import com.xwork.dp.dto.InstagramApplicationDTO;

public class ApplicationDAO {
	ApplicationDTO[] appDto=new ApplicationDTO[5];
	FacebookApplicationDTO[] fbDTO=new FacebookApplicationDTO[5];
	InstagramApplicationDTO[] instaDTO= new InstagramApplicationDTO[5];
	private int count;
	
	public void add(ApplicationDTO dto)
	{
		if(count<appDto.length)
		{
			appDto[count++]=dto;
			System.out.println("added element:".concat(dto.getFounder()));
		}
		else
		{
			System.err.println("Invalid".concat(String.valueOf(this.count)));
		}
		
	}
	
	public void display()
	{
		for(int monday=0;monday<appDto.length;monday++)
		{
ApplicationDTO refer=appDto[monday] ;
		if(refer!=null)
		{
			System.out.println(refer.getCompany());
			System.out.println(refer.getFounder());
			System.out.println(refer.getName());
			System.out.println(refer.getVersion());
			
			
		}
		
		else
		{
			System.err.println("Array is full"
					.concat(String.valueOf(appDto.length)));
			
			
		}
		}
	}
		
	public ApplicationDTO  getAppDTOByName(String name)
	{
		System.out.println("Entered name is:".concat(name));
		if(name!=null)
		{
			
			for(int anu=0;anu<appDto.length;anu++)
			{
				
			ApplicationDTO ref=this.appDto[anu];
			if(ref!=null) {
				
			String temp=ref.getName();
			if( name.equals(temp))
			{
				
				System.out.println("name is matched:".concat(name));
				
			}}
				
				
			}}
			
		
		else
		{
			
			System.err.println("No match");
		}
		
	return null;
	}
	
	public void saveFb(FacebookApplicationDTO dto)
	{
		if(count<fbDTO.length)
		{
			fbDTO[count++]=dto;
			System.out.println("added element:".concat(dto.getCeoName()));
		}
		else
		{
			System.out.println("invalid".concat(String.valueOf(fbDTO.length)));
			
		}}
			
	public void displayFb()
	{
		for(int moon=0;moon<fbDTO.length;moon++)
		{  
			FacebookApplicationDTO refer=fbDTO[moon];
			if(refer!=null)
			{
				System.out.println(refer.getName());
				System.out.println(refer.getFounder());
				System.out.println(refer.getVersion());
				System.out.println(refer.getCompany());
				System.out.println(refer.getCeoName());
				System.out.println(refer.getHeadQuarter());
				
			}
			else
			{
				System.err.println("Array is full");
				
			}}}
			
	public void saveInsta(InstagramApplicationDTO dto)
	{
		
		if(count<instaDTO.length)
		{
			instaDTO[count++]=dto;
			System.out.println("Saved name:".concat(dto.getServerLocation()));
			
		}
		else
		{
		System.err.println("Array is full");	
			
		}
		
	}
		
public void displayInsta()
{
	for(int mars=0;mars<instaDTO.length;mars++)
	{ 
		InstagramApplicationDTO ref=instaDTO[mars];
		if(ref!=null)
		{
		System.out.println(ref.getCompany());	
		System.out.println(ref.getFounder());	
		System.out.println(ref.getName());	
		System.out.println(ref.getServerLocation());	
		System.out.println(ref.getVersion());	
		System.out.println(ref.getTotoalUsers());	
			
			
		}
		
		
	}

}
		
	
		
		
	
	
}
