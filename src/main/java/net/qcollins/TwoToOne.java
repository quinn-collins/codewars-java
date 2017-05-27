package net.qcollins;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoToOne {
    
    public static String longest(String s1, String s2) {
    	Set<Character> stringSet = new LinkedHashSet<Character>();
    	String combinedString = s1 + s2;
    	String sortedString = "";
    	char[] stringToCharArray = combinedString.toCharArray();
    	Arrays.sort(stringToCharArray);
    	for(char c: stringToCharArray) {
    		stringSet.add(c);
    	}
    	for(Character c: stringSet){
    		sortedString += c;
    		
    	}
    	
    	
    	
    	
    	System.out.print(sortedString);
    	return sortedString;
    }
}

