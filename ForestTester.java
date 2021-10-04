class ForestTester
{
public static void main(String[] animals)
{
	//acessing F-cls varia frm forest ref //state.cmname
	//String cmname="Basavraj Bommai";
	//State ref1=new State();
	Forest forest=new Forest("Nagarhole","Mysore",true);
	System.out.println(forest.name);
	System.out.println(forest.location);
	System.out.println(forest.reserved);
	System.out.println(forest.state);
	//creating instance for State and acessing using forest ref
System.out.println("***1***");
//forest.state=new State();
String cm="Poo";
int stateno=32;
State state=new State(cm,stateno);
System.out.println(state.cmname);
System.out.println(state.noofDistricts);


	//System.out.println(state.noofDistricts=32);
System.out.println(forest);

System.out.println("***2***");
//acessing forest name and storing it and printing
String fname=forest.name;
 String loca=forest.location;
 boolean stat=forest.reserved;
System.out.println(fname);
System.out.println(stat);

System.out.println("***3***");
 State state1=forest.state;
 String name=state1.name;
 int statenu=state1.noofDistricts;
 System.out.println(statenu);
 System.out.println(name);
 System.out.println("***3***");
   state.capcity=new CapitalCity("Banglore","diversity");
   CapitalCity city=state.capcity;
   System.out.println(city.name);

//state.ref=new CapitalCity("Banglore","diversity");
CapitalCity capcity=state.city;



}
}