package com.xwork.dp.dao;

import com.xwork.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {
	
	
	private WebSeriesDTO[] webDtos=new WebSeriesDTO[19];
	private int count=0;
	 
	public void save(WebSeriesDTO name)
	{
		
		if(this.count<webDtos.length && name!=null)
		{
			System.err.println("Save is invoked");
			 this.webDtos[count++]=name;
			System.out.println("WebSeries name:".concat(name.getName()));
			System.err.println();
		}
		else 
		{
			System.err.println("Either container is full or passed reference is null");
			
		}
	}

	private String WebSeriesDTO() {
		// TODO Auto-generated method stub
		return null;
	}

}
