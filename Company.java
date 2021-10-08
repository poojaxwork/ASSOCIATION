class Company
{
String name;
String founder;
int est;
long noOfEmployees;
String headQuarter;
float revenue;
int noOfBranches;


void setName(String name)
{
	this.name=name;
	System.out.println(name);
}
void setFounder(String founder)
{
	this.founder=founder;
	System.out.println(founder);
}

void setEst(int est)
{
	this.est=est;
	System.out.println(est);
}

void setNoOfEmployees(long noOfEmployees)
{
	this.noOfEmployees=noOfEmployees;
	System.out.println(noOfEmployees);
}

void setHeadQuarter(String headQuarter)
{
	this.headQuarter=headQuarter;
	System.out.println(headQuarter);
}

void setRevenue(float revenue)
{
	this.revenue=revenue;
	System.out.println(revenue);
}

void setNoOfBranches(int noOfBranches)
{
	this.noOfBranches=noOfBranches;
	System.out.println(noOfBranches);
}


}