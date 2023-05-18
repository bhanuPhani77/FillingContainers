package com.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayDuplicates {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 15, 50, 15, 25, 1, 8, 55, 41, 40, 26, 19, 11, 15, 11);

		List<Integer> collect = intList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(collect);

		int[] arr = { 1, 15, 50, 15, 25, 1, 8, 55, 41, 40, 26, 19, 11, 15, 11, 25 };
		System.out.println(findDuplicates(arr));

	}

	public static Set<Integer> findDuplicates(int[] arr) {
		int length = arr.length;
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					set.add(arr[i]);
					break;
				}
			}
		}
		return set;
	}
}
