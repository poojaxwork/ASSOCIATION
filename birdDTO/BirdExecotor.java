package com.xwork.birdDTO;

public class BirdExecotor {

	public static void main(String[] args) {
BirdDTO dto=new BirdDTO("581-F", "Pegion", 2, "BTM", true);
BirdDTO dto1=new BirdDTO("581-F", "Wood Peaker", 1, "Hassan", true);
BirdDTO dto2=new BirdDTO("581-F", "Sparrow", 3, "shimoga", true);

BirdDAO birddao=new ArrayBridDAO();
BirdAssociation association=new BirdAssociation(birddao);

association.save(dto);
association.save(dto1);
association.save(dto2);
association.display();

association.display();
association.update(1, dto2);
System.err.println("Afer update");
association.display();
association.delete(2);
System.err.println("Afer delete");
association.display();

	}

}
