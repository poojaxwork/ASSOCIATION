package com.xwork.diode;

import com.xwork.constant.Material;
import com.xwork.constant.SockType;
import com.xwork.constant.Sockszie;

public class Socks {
	private Sockszie size;
	private float price;
	private Material material;
	private SockType type;

	public Sockszie getSize() {
		return size;
	}

	public void setSize(Sockszie size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "toString-override";
	}

	@Override
	public int hashCode() {
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("input is null");
			return false;
		}
		if (obj instanceof Socks) {
			Socks casted = (Socks) obj;
			Material mat = casted.getMaterial();
			float cost = casted.getPrice();
			Float auto = Float.valueOf(cost);
			Float pri = Float.valueOf(price);
			if (this.material.equals(mat) && pri.equals(auto)) {
				System.out.println("type is matched");
				return true;
			}
		}

		{

		}

		return false;
	}
}
