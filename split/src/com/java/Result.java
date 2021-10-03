package com.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	upToDown(arr);
    	return 0;
    }
    
    private static int upToDown(List<List<Integer>> arr) {
    	
    	int count1 = 0; int count2 = 0;
    	    
    	 int n= arr.size();   
    	for(int i=0;i<n;i++){
    		System.out.println(arr.get(i).get(i));
    		System.out.println("ddd "+arr.get(i).get(n-i-1));
    		 count1+=arr.get(i).get(i);
    		 count2+=arr.get(i).get(n-i-1);
            
        }
    	System.out.println(count1 + " " +count2); 
    	return 0;
    }

}

