package net.qcollins;

public class SmallestIntegerFinder {
	
	
    public static int findSmallestInt(int[] args) {
    	int smallest = args[0];
    	for(int num : args) {
    		smallest = (num > smallest) ? smallest : num;
    	}
    	return smallest;
    }
}