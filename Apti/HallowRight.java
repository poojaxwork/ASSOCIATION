class HallowRight
{
public  static void main(String[] a)
{
for(int row=0;row<=5;row++)
{
for(int col=0;col<=5;col++)
{
if(row==5)
{
System.out.print("*");
}
else if(col==5)
{
System.out.print("*");
}
else if(row+col==5)
{
	System.out.print("*");
	
}

else
	System.out.print(" ");


}
System.out.println("");
}



}


}