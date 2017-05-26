package net.qcollins;

public class FindTheMissingLetter {
	
	//Just realized after putting in all this work, that I could've checked if array[i] - array[i-1] == 1
	public static char findMissingLetter(char[] array) {
		char[] alphabet = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int j = -1;
		for(int i = 0; i < alphabet.length; i++){
			j++;
			if(array[0] == alphabet[i]){
				
				break;
			}
		}
		for(int i = 0; i < array.length; i++){
			if (array[i] != alphabet[i + j]) {
				System.out.println(alphabet[i]);
				return alphabet[i + j];
			}
		}
		
		return ' ';
	}
}