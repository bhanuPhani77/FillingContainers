package com.bhnu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainerFill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of continers");
		int containers = sc.nextInt();
		System.out.println("eneter no.of people");
		int people = sc.nextInt();
		int[] volumes = new int[containers];

		for (int i = 0; i < volumes.length; i++) {
			System.out.println("Enter volume for container: " + i);
			volumes[i] = sc.nextInt();
		}

		int p1 = 0, p2 = 0, p3 = 0;
		if (people == 3) {
			System.out.println("containers for p1:");
			p1 = sc.nextInt();
			System.out.println("containers for p2:");
			p2 = sc.nextInt();
			System.out.println("continers for p3");
			p3 = sc.nextInt();
		} else {
			volumes = new int[containers];
			System.out.println("containers for p1:");
			p1 = sc.nextInt();
			System.out.println("containers for p2:");
			p2 = sc.nextInt();
		}

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < volumes.length; i++) {
			li.add(volumes[i]);
		}

		for (int i = 0; i < li.size(); i++) {
			if (p1 == 1 || p2 == 1 || p3 == 1 && people == 3) {
				p2 = li.get(i + 2);
			}
			if (p1 == 2 || p2 == 2 || p3 == 2 && people == 3) {
				p1 = li.get(i) + li.get(i + 1);
				p3 = li.get(i + 3) + li.get(i + 4);
			}
			if (p1 == 3 || p2 == 3 || p3 == 3 && people == 3) {
				p1 = li.get(i) + li.get(i + 1) + li.get(i + 2);

			}
			if (p1 == 3 && people == 3) {
				p1 = li.get(i) + li.get(i + 1) + li.get(i + 2);
			}
			if (p2 == 2 && people == 2) {
				p2 = li.get(i + 3);
			}
		}
		// System.out.println(p1+" "+p2+" "+p3);
		if (people == 2) {
			int max = Math.max(p1, p2);
			System.out.println("Job will be completed at time: " + max);
		}
		if (people == 3) {
			int max = Math.max(p1, p2);
			int max2 = Math.max(p2, p3);
			int max3 = Math.max(max, max2);
			System.out.println("Job will be completed at time: " + max3);
		}
	}
}
