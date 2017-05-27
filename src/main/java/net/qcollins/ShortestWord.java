package net.qcollins;

public class ShortestWord {
    public static int findShort(String s) {
        int shortestString = 1000;
        String[] words = s.split(" ");
        for(String word : words) {
        	shortestString = (word.length() < shortestString) ? word.length() : shortestString;
        }
        return shortestString;
    }
}