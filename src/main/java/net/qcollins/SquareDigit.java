package net.qcollins;

public class SquareDigit {
	 public int squareDigits(int n) {
		 String integerString = Integer.toString(n);
		 char[] integerArray = integerString.toCharArray();
		 String finished = "";
		 for(char a : integerArray) {
			 int b = Integer.valueOf(String.valueOf(a)) * Integer.valueOf(String.valueOf(a));
			 finished = finished + b;
		 }
		 return Integer.valueOf(finished);
	 }

}
