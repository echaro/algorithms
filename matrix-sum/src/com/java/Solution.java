package com.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList();
        List<Integer> arr1 = new ArrayList();
        List<Integer> arr2 = new ArrayList();
        List<Integer> arr3 = new ArrayList();
        
        arr1.add(11);
        arr1.add(2);
        arr1.add(4);
        
        
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        
        
        arr3.add(10);
        arr3.add(8);
        arr3.add(-12);
        
       arr.add(arr1);
       arr.add(arr2);
       arr.add(arr3);

        int result = Result.diagonalDifference(arr);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}