package com.xwork.birdDTO;

public class BirdAssociation {
BirdDAO birddao;
public BirdAssociation() {

}
public BirdAssociation(BirdDAO birddao) {
this.birddao=birddao;
}
void save(BirdDTO dto)
{
	if(dto!=null)
	{
		birddao.save(dto);
	}
	
	
	}
void display()
{
	birddao.display();
}

void update(int indexNo,BirdDTO dto)
{
birddao.update(indexNo, dto);	

}
void delete(int index)
{
	birddao.delete(index);
	
	}
}
