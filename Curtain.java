class Curtain
{
private String fabric,color,type;
private float price;
boolean design;
void setFabric(String fabric)
{
	this.fabric=fabric;
	//System.out.println(fabric);
	
}
 String getFabric()
{
	//this.fabric=fabric;
	//System.out.println(fabric);
	return this.fabric;
}
	
	



void setColor(String color)
{
	this.color=color;
	//System.out.println(color);
	
}
String getColor()
{
	return this.color;
	
}
void setType(String type)
{
	this.type=type;
	//System.out.println(type);
	
}
String getType()
{
	return this.type;
	
	
}
void setPrice(float price)
{
	this.price=price;
	//System.out.println(price);
	
}
float getPrice()
{
	return this.price;
	
}
void setDesign(boolean design)
{
	this.design=design;
	//System.out.println(design);
	
}
boolean getDesign()
{
	return this.design;
	
}

}