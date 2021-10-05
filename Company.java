class Company
{
String name;
Country country;
String ceo;
String cfo;
 Company()
 {
	 
	 
 }
 
 Company(String name,String ceo,String cfo)
 {
	this.name=name;
	this.ceo=ceo;
	this.cfo=cfo;
 }
Company(Country country) 
{
	this.country=country;
	
}
	 
 
 void display()
 {
 System.out.println("Company is invoked");
 System.out.println(this.name);
 System.out.println(this.ceo);
 System.out.println(this.cfo);
 System.out.println(this.country);
 
 
 }


}