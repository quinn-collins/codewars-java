package net.qcollins;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    	int x = 0;
    	int y = 1;
        for(int i = binary.size() - 1; i >= 0; i--) {
        		x += binary.get(i) * y;
        		y *= 2;
        }
        return x;
    }
}