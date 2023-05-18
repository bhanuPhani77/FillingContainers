package com.bhnu.customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cargo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cargo:");
		int n = sc.nextInt();
		int[] cargo = new int[n];
		String[] shipment = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the cargo id: ");
			cargo[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the shipment name: ");
			shipment[i] = sc.next();
		}
		Map<Integer, String> Greendart = new HashMap<Integer, String>();
		for(int i =0; i<n;i++) {
			Greendart.put(cargo[i], shipment[i]);
		}
		System.out.println(Greendart);
		System.out.println("Enter the cargo id: ");
		int cargoid = sc.nextInt();
		System.out.println(Greendart.get(cargoid));
	}

}
