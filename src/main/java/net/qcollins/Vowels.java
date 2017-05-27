package net.qcollins;

public class Vowels {

	  public static int getCount(String str) {
	    int vowelsCount = 0;
	    for(int i = 0; i < str.length(); i++) {
	    	if(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e') {
	    		vowelsCount++;
	    	}
	    }
	    
	    return vowelsCount;
	  }

	}