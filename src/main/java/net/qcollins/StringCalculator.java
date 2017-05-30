package net.qcollins;

public class StringCalculator {

	public int add(String numbers) {
		int sum = 0;
		numbers = numbers.replaceAll("/n", " ");
		numbers = numbers.replaceAll(",", " ");
		numbers = numbers.replaceAll(" ", " ");
		numbers = numbers.replaceAll(";", " ");
		numbers = numbers.replaceAll("!", " ");
		numbers = numbers.replaceAll("/", " ");
		numbers = numbers.replaceAll("\n", " ");
		String[] numbersArray = numbers.split(" ");
		for(String word : numbersArray) {
			if(word.equals("")){
				
			}
			else {
				sum += Integer.valueOf(word);
			}
		}
		return sum;
	}
}
