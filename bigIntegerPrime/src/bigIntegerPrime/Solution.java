package bigIntegerPrime;

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



public class Solution {
    
    public String isPrime(String value){
        
        BigInteger bigInte = new BigInteger(value);
        boolean result = bigInte.isProbablePrime(1);
        if(result){
            return "prime";
        }
        return "not prime";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        Solution sol = new Solution();
        System.out.println(sol.isPrime(n));
    }
}
