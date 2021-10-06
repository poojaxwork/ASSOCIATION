class Product
{
String name;
static int quant;
String vendor;
float price;
String type;
static float totalProductsPrice;

void getdisplay()
{
System.out.println(name);
System.out.println(quant);
System.out.println(vendor);
System.out.println(price);
System.out.println(type);
}
 Product(String name,int quant,String vendor,float price,String type)
{
this.name=name;
this.quant=quant;
this.vendor=vendor;
this.price=price;
this.type=type;
}
void getTotal()
{
	float total=this.quant*this.price;
	System.out.println(total);
	totalProductsPrice=totalProductsPrice+total;
}
	
	static void getGrandTotal()
	{
	System.out.println("Grand total:" + totalProductsPrice);	
		
		
	}


}