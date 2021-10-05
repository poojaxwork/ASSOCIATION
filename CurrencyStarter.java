class CurrencyStarter
{
public static void main(String[] rbi)
{
	Currency currency=new Currency("Rupees",70.98f);
	currency.displayCurrency();
	System.out.println("****");
	currency.country=new Country();
	Country count=currency.country;
	Country count1=new Country("India",91);
	count1.getdetails();
	//currency.displayCurrency();
	System.out.println("****");
	Company company=new Company("ORACLE","safra","kanvar");
	company.display();
	company.country=new Country();
	Country ref=company.country;
System.out.println("****");
Application appli=new Application("Java",7);
appli.displayDetails();
appli.company=new Company();
System.out.println("**2 instance**");
Currency currency1=new Currency("EURO",86.37f);
	currency1.displayCurrency();
	System.out.println("****");
	currency1.country=new Country();
	Country countr=currency1.country;
	Country count2=new Country("Austria",92);
	count2.getdetails();
	//currency.displayCurrency();
	System.out.println("****");
	Company company1=new Company("Messenger","Mark Zuckerberg","David wehner");
	company1.display();
	company1.country=new Country();
	Country ref1=company1.country;
System.out.println("****");
Application applic=new Application("FACEBOOK",8);
applic.displayDetails();
applic.company=new Company();
System.out.println("**3 instance**");
Currency currency2=new Currency("DOLLAR",74.52f);
	currency2.displayCurrency();
	System.out.println("****");
	currency2.country=new Country();
	Country coun=currency2.country;
	Country count3=new Country("US",01);
	count3.getdetails();
	//currency.displayCurrency();
	System.out.println("****");
	Company company2=new Company("AMAZON","Andy jassy","Jeff bezos");
	company2.display();
	company2.country=new Country();
	Country ref3=company.country;
System.out.println("****");
Application app=new Application("Shopping",11);
app.displayDetails();
app.company=new Company();
System.out.println("**4 instance**");
Currency currency4=new Currency("canadian",70.98f);
	currency4.displayCurrency();
	System.out.println("****");
	currency4.country=new Country();
	Country count5=currency4.country;
	Country count6=new Country("canada",81);
	count6.getdetails();
	//currency.displayCurrency();
	System.out.println("****");
	Company company4=new Company("SpaceX","Elon Musk","Gwynne");
	company4.display();
	company4.country=new Country();
	Country ref4=company.country;
System.out.println("****");
Application appl=new Application("Application software",14);
appl.displayDetails();
appl.company=new Company();
System.out.println("****5 instance**");
Currency obj=new Currency("USD",58.9f);
obj.displayCurrency();
obj.country=new Country();
Country obj2=obj.country;
obj2.getdetails();
System.out.println("****");
 Country cntry=new Country("US",87); 
cntry.getdetails();
System.out.println("****");
Company comp=new Company("Imagination","pooja","xyz");
comp.display();
comp.country=new Country("india",92);

Country obj4=comp.country;
obj4.getdetails();
System.out.println("****");
Application application=new Application("watsapp",5);
application.displayDetails();
application.company=new Company();
Company example=application.company;
example.display();

	

}


}
