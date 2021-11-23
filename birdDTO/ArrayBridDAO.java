package com.xwork.birdDTO;

public class ArrayBridDAO implements BirdDAO{
private int count;
private BirdDTO[] birddto=new BirdDTO[5];
	@Override
	public void save(BirdDTO dto) {
		if(count<birddto.length && dto!=null)
			
		{
			birddto[count++]=dto; 
			System.out.println("Saved data is: ".concat(String.valueOf(dto.getBreed())));
		}
		else
		{
			System.out.println("Nothing to save");
			
		}
	}
	
	@Override
	public void display() {
for(int i=0;i<birddto.length;i++)
{
BirdDTO bird=birddto[i];
if(bird!=null)
{
System.out.println(bird.getAge());
System.out.println(bird.getBreed());
System.out.println(bird.getId());
System.out.println(bird.getOrigin());
System.out.println(bird.isCanFly());

}
else
{
	System.err.println("arrar index is pointing to null".concat(String.valueOf(i)));}
	}}
	@Override
	public int update(int index, BirdDTO birddto) {
if(index>=0 && index<=this.birddto.length)
{
this.birddto[index]=birddto;
System.out.println("Updated value :".concat(String.valueOf(index)));
}
		
		return 0;
	}
	@Override
	public int delete(int index) {
		if(index<birddto.length && index>=0)
		{
			System.out.println("delete is successfull");
			birddto[index]=null;
		}
		else
		{
			System.out.println("Delete is not carried out");
		}
		
		return 0;
	}

	
	

	
}
