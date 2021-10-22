package com.xwork.chocolate;

import java.util.Iterator;

public class LabourStarter {

	public static void main(String[] args) {
		Labour labour = new Labour();
		labour.printNames("praveen");
		labour.printNames("pallavi");
		labour.printNames("prithvi");
		labour.printNames("pranav");
		labour.printNames("prarthana");
		labour.printNames("pavan");
		labour.update("pooja", 0);
		labour.delete(9);
		String[] refer = labour.getName();
		for (int i = 0; i < refer.length; i++) {
			System.out.println(refer[i]);

		}

		System.err.println("****");
		Coffee ref = new Coffee();
		ref.printNames("Black coffee");
		ref.printNames("Instant coffee");
		ref.printNames("Filter coffee");
		ref.printNames("BRU");
		ref.printNames("NESCAFE");
		ref.printNames("LEVISTA");

		ref.newName("Pooja", 2);
		ref.deleteIndex(2);
		String[] coffarr = ref.getNames();
		for (int i = 0; i < coffarr.length; i++) {
			System.out.println(coffarr[i]);

		}

	}

}
