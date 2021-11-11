package com.xwork.diode;

public class Food {
	private String food;
	private float price;
	private int quantity;
	private boolean good;
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
@Override
public String toString() {
	return "override";
}
@Override
public int hashCode() {
	return 88;
}
@Override
public boolean equals(Object obj) {
	if(obj==null)
	{
		
		System.out.println("input is invalid");
		return false;
	}
	
	if(obj instanceof Food)
	{
		Food casted=(Food)obj;
		String ref=casted.getFood();
		float refer=casted.getPrice();
		Float wrap=Float.valueOf(refer);
		Float pri=Float.valueOf(price);
		if(this.food.equals(ref) && pri.equals(wrap))
		{
			System.out.println("type is matched");
			return true;
		}
		else
		{
			
			System.err.println("type is mismatched");
			return false;
		}
		
	}
	
	return false;
}

}
