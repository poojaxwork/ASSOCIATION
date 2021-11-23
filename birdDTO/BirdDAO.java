package com.xwork.birdDTO;

public interface BirdDAO {

	
	 void save(BirdDTO dto);
	 
	void display();
int update(int index, BirdDTO birddto);
	int delete(int index);
	
}
