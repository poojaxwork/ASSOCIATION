package com.xwork.starter;

import com.xwork.constant.TypeHeadset;
import com.xwork.diode.HeadSet;

public class HeadsetStarter {

	public static void main(String[] args) {
HeadSet head=new HeadSet();
System.out.println(head);
System.out.println(head.hashCode());
HeadSet head1=new HeadSet();
System.out.println(head1.toString());
head.setBrand("Boat");
head1.setBrand("Boat");
head.setType(TypeHeadset.EARBUDS);
head1.setType(TypeHeadset.NOISECANCELLING);

System.out.println(head.equals(head1));

	}

}
