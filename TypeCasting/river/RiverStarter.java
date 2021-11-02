package com.xwork.casting.river;

import com.xwork.Krishna.KrishnaRiver;

public class RiverStarter {

	public static void main(String[] args) {
River riverref=new KaveriRiver();

KaveriRiver refKaveri=(KaveriRiver)riverref;
System.err.println("@@@@@@@");
Object objectKrish=new KrishnaRiver();

KrishnaRiver krishref=(KrishnaRiver)objectKrish;


if(riverref instanceof KrishnaRiver)
{
KrishnaRiver krishref1=(KrishnaRiver)riverref;//this is to prvent exception
}
//TypeCasting

/*
KrishnaRiver krishref1=(KrishnaRiver)riverref;
this will throw class cast execption because riverref >>> kaveririver.
but here using riverref >>>we try to cast for KRISHNARIVER>>CLASSCASTEXEPTION.
*/



/*Object object=new String();

if(object instanceof KaveriRiver)//instance used is  to prevent classcastExeption
{
KaveriRiver kaveri1=(KaveriRiver)object;

	}*/
//Array can store different elements
Object[] river=new Object[5];
river[0]="Pooja";
river[1]=4746;
river[2]=krishref.tributories;
river[3]=riverref.name;
river[4]=refKaveri.origin;
for(int mars=0;mars<river.length;mars++)
{
System.out.println(river[mars]);	

}

River[] riverarr=new River[3];
riverarr[0]=krishref;
riverarr[1]=riverref;
riverarr[2]=refKaveri;

}}
