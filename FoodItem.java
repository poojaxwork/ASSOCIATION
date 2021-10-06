class FoodItem
{
String name;
float price;
String hotelName;
int quantity;
Type type;
float rating;
OrderType ordertype;
static float TotalFoodItemsPrice;
static String hotel;
static float cost;
static String food;
  
  FoodItem(String name,float price,String hotelName,int quantity,Type type,
float rating,OrderType ordertype)
{
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	this.quantity=quantity;
	this.type=type;
	this.rating=rating;
	this.ordertype=ordertype;
	
}
void getDisplay()
{
	System.out.println(name);
	System.out.println(price);
	System.out.println(hotelName);
	System.out.println(quantity);
	System.out.println(type);
	System.out.println(rating);
	System.out.println(ordertype);

}
void printTotalPrice()
{
	float total=this.price*this.quantity;
	System.out.println("Total price=" + total);
	TotalFoodItemsPrice=TotalFoodItemsPrice+total;
	hotel=hotel+hotelName;
	cost=cost+price;
	food=food+name;
}

static void getGrandTotal()
{
System.out.println("GrandTotal price="  + TotalFoodItemsPrice);	
}

static void printHotelname()
{
	
	//hotel=hotel+hotelName;
	System.out.println(hotel);
	
}
static void printNameAndPrice()
{
	System.out.println(cost);
	System.out.println(food);
	
	
}
	

}