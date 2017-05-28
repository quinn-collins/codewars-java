package net.qcollins;

public class HighestAndLowest {
	
	public static String HighAndLow(String numbers) {
		String[] numbersArray = numbers.split(" ");
		int highest = -10000000;
		int lowest = 10000000;
		for(String word : numbersArray) {
			int value = Integer.valueOf(word);
			highest = (value < highest) ? highest : value;
			lowest = (value > lowest) ? lowest : value;
		}
		return String.valueOf(highest) + " " + String.valueOf(lowest);
		
	}
	
}
