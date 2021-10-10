class CurtainStarter
{
public static void main(String grace[])
{
Curtain curt=new Curtain();
curt.setFabric("Synthetic");
//System.out.println(curt.getFabric());
curt.setFabric("Coton");
System.out.println(curt.getFabric());
curt.setColor("Blue");
System.out.println(curt.getColor());
curt.setType("Window");
System.out.println(curt.getType());
curt.setPrice(280.6f);
System.out.println(curt.getPrice());
curt.setDesign(false);
System.out.println(curt.getDesign());
}


}