class IceTester
{
public static void main(String[] lakes)
{
	Icecream cream=new Icecream("Vanila",-28.8f,Color.YELLOW);
	System.out.println(cream.flavour);
	System.out.println(cream.color);
	System.out.println(cream.temp);
	//System.out.println(cream.type);
	System.out.println(cream.brand);
	cream.type="cone";
	System.out.println("********");
	
	//after creting an instance for BrandN
	 cream.brand=new BrandN();
	 System.out.println(cream.brand);
	 System.out.println(cream);
	 System.out.println("********");
	 //get flavour from icecream & stored it in loacal variable
// flavour is storing into ref variable flav and printing it	
	String flav=cream.flavour;
	 System.out.println(flav);
	 float temp=cream.temp; 
System.out.println("********");
	 // accessing variable from BrandN class by ref cream
	 BrandN brand=cream.brand;
	 String name=brand.name;
	 String location=brand.location;
	 String oname=brand.ownername;
	 int since=brand.since;
	 System.out.println(name);
	 System.out.println(location);
	 System.out.println(oname);
	 System.out.println(since);
	 
	 
	System.out.println("********");
	//assigning values to ref but not acsessing the variable using ref(just initialize)
	//so its still print.
	
	 brand.name="AMUL";
	 brand.ownername="Vergese";
	 brand.since=1955;
	 System.out.println(name);
	 System.out.println(location);
	 System.out.println(oname);
	 System.out.println(since);
	 
	 System.out.println("********");
//here acessing brand variabls using ref (brand)
//cream.brand=null;
System.out.println(brand.ownername);
//if we assign brand=null then try to access using brand.name throws null pointer 
//exection as alredy brand is pointed to null
System.out.println(brand.name);	
System.out.println(brand.location);
}
}