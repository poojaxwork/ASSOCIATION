package com.xwork.diode;

import com.xwork.constant.TyreType;

public class Tyre {
	private String brand;
	private TyreType type;
	private float price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public TyreType getType() {
		return type;
	}

	public void setType(TyreType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (obj instanceof Tyre) {
			Tyre ref = (Tyre) obj;
			String brd = ref.getBrand();
			float cost = ref.getPrice();
			Float costref = Float.valueOf(cost);
			Float priref = Float.valueOf(cost);
			if (this.brand.equals(brd) && costref.equals(priref)) {

				return true;
			} else {

				System.out.println("Mismatch");
			}

		}
		return false;
	}

}

