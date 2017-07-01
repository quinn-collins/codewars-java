package net.qcollins;

import java.util.ArrayList;

public class ExpandedForm {
	public static String expandedForm(int num)
	{
		ArrayList<Integer> numArray = new ArrayList<>();
		String numString = String.valueOf(num);
		char[] charNumArray = numString.toCharArray();
		for(char numChar : charNumArray) {
			numArray.add(Integer.valueOf(String.valueOf(numChar)));
		}
		int length = numArray.size() - 1;
		String result = "";
		for(int i = 0; i < numArray.size(); i++) {
			if(numArray.get(i)==0){
				length--;				
				
			} else {
				result = result + String.valueOf((int)(numArray.get(i) * (Math.pow(10, length))));
				length--;
			}
			if(numArray.size() - i > 1 && numArray.get(i+1) !=0) {
				result = result + " + ";
			}
		}
		
		return result;
	}
}
