package net.qcollins;

public class EqualSidesOfAnArray {
	  public static int findEvenIndex(int[] arr) {
	      for(int i = 1; i < arr.length; i++) {
	      int x = 0;
	      int y = 0;
	        for(int j = 0; j < i; j++) {
	          x = x + arr[j];
	        }
	        for(int j = i; j < arr.length - 1; j++) {
	          y = y + arr[j + 1];
	        }
	        if(x == y) {
	          return i;
	        }
	       }
	       return -1;
	       
	  }
	}