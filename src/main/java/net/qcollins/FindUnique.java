package net.qcollins;

import java.util.HashSet;

public class FindUnique {
	public static double findUnique(double arr[]) {
		HashSet<Double> removeDuplicates = new HashSet<>();
		for(double number : arr) {
			removeDuplicates.add(number);
		}
		return 0;
		
	}
}
