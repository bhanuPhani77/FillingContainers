package com.singleton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {

	public static void main(String[] args) {
		Map<Integer, String> Employee = new HashMap<Integer, String>();
		Employee.put(123, "Kumaran");
		Employee.put(124, "Uday");
		Employee.put(125, "Meena");
		Employee.put(126, "Anusha");
		Iterator itr = Employee.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(Employee.get(itr.next()));   
            // adding an element to Map   
            // exception will be thrown on next call   
            // of next() method.   
            Employee.put(456, "Turkey"); 
		}

	}

}
