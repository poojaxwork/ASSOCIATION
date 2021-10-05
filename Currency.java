class Currency
{
String name;
 Country country;
float value;
Currency(String name,float value)
{
	this.name=name;
	//this.country=country;
	this.value=value;
}
void displayCurrency()
{
System.out.println(this.name);	
System.out.println(this.country);
System.out.println(this.value);	
	
}


}