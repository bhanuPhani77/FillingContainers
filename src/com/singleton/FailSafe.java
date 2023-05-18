package com.singleton;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cli = new CopyOnWriteArrayList<>(new Integer[] { 1, 7, 9, 11 });
		Iterator itr = cli.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
			 if (i == 7)   
	                cli.add(15); // It will not be printed  
	            //This means it has created a separate copy of the collection 
		}
	}
}
