package com.xwork.starter;

import com.xwork.constant.Material;
import com.xwork.diode.Socks;

public class SocksStarter {

	public static void main(String[] args) {
		Socks sock = new Socks();

		System.out.println(sock.toString());
		System.out.println(sock.hashCode());
		Socks sock1 = new Socks();
		sock.setPrice(100);
		sock1.setPrice(100);
		sock.setMaterial(Material.COTTON);
		sock1.setMaterial(Material.COTTON);
		System.out.println(sock.equals(sock1));

	}

}
