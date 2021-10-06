class MovieTicket
{
String movieName;
String theater;
float price;
int noOfSeats;
Types type;


MovieTicket(String movieName,String theater,float price,int noOfSeats,
Types type)
{
this.movieName=movieName;
this.theater=theater;
this.price=price;
this.noOfSeats=noOfSeats;
this.type=type;

}
void dispalyDetails()
{
System.out.println(movieName);
System.out.println(theater);
System.out.println(price);
System.out.println(noOfSeats);
System.out.println(type);
System.out.println(Types.FIRSTCLASS.price);
System.out.println(Types.FIRSTCLASS.tax);

}
void Totalprice()
{
	float total=noOfSeats*price;
	System.out.println("Total price=" + total);
}


}