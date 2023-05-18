package com.bhnu.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nuber of customers: ");
		int n = sc.nextInt();
		String s = "null";
		List<String> li = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter name for " + i + " customer:");
			s = sc.next();
			li.add(s);
		}
		System.out.println(li);
		System.out.println("Enter a customer name to find in the list of customers:");
		String str = sc.next();
		int size = li.size();
		System.out.println(size);
		boolean isPresent = li.contains(str);
		if (isPresent) {
			System.out.println(str + " is found in the list.");
		} else {
			System.out.println("please enter correct name to maatch: " + str);
		}
	}

}
