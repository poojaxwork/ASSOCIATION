class FoodStarter
{
public static void main(String... puri)
{
FoodItem obj=new FoodItem("DOSA",800.0f,"Vidyarthi bhavan hotel",2,Type.SOUTHINDIAN,4.5f,OrderType.ONLINE);
obj.getDisplay();
obj.printTotalPrice();
FoodItem obj1=new FoodItem("Pulav",900.0f,"Isiri hotel",2,Type.SOUTHINDIAN,4.5f,OrderType.ONLINE);
obj1.getDisplay();
obj1.printTotalPrice();
  
  
  FoodItem.getGrandTotal();
FoodItem.printHotelname();
FoodItem.printNameAndPrice();

}
}