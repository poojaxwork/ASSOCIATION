package com.xwork.starter;

import com.xwork.diode.Food;

public class FoodStarter {
public static void main(String args[])
{
Food food=new Food();
System.out.println(food.toString());
System.out.println(food.hashCode());
Food food1=new Food();
food.setFood("puri");
food1.setFood("puri");
food.setPrice(90.7f);
food1.setPrice(90.7f);
System.out.println(food.equals(food1));
}
}
