package com.xwork.DAO;

import com.xwork.DTO.AirportDTO;

public class AirportArrayDAO implements AirportDAO {
AirportDTO[] airportdto=new AirportDTO[5];
private int count;
	@Override
	public void save(AirportDTO dto) {
	if(count<=airportdto.length)
	{
		airportdto[count++]=dto;
		System.out.println("Saved data:".concat(String.valueOf(dto.getLocation())));
		
	}
	}

	@Override
	public void update(int index, AirportDTO dto) {
if(index>=0 && index<airportdto.length && dto!=null)
{
	
	airportdto[index]=dto;
	System.out.println("update is successfull");
	}
else
{
	System.err.println("uopdate is failed");}
		
	}

	@Override
	public void delete(int index) {
		if(index>=0 && index<airportdto.length)	
		{
			airportdto[index]=null;
			
			}
		else {
			System.err.println("delete is failed");
		}
	}

	@Override
	public void display() {
for(int i=0;i<airportdto.length;i++)
{
	AirportDTO ref=airportdto[i];
	if(ref!=null)
	{

		System.out.println(ref.getName());
		System.out.println(ref.getLocation());
		System.out.println(ref.getId());
		System.out.println(ref.getType());
		
	}
	
	}
	}

}
