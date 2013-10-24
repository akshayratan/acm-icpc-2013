/**
 *
 * @author Akshay Ratan with Team Algobusters in ACM ICPC Amritapuri Regional (C) 2013
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fleet {

    public static void main(String[] args)throws IOException{
     
        Scanner sc=new Scanner(System.in);
        int test; //test cases
        test= sc.nextInt();
        int arr[]=new int[test];
        for(int i=0;i<test;i++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();
            int j = 0;
            int ans = 0;
            while(n>0)
            {
                ans = ans+2*t;
                n = n-m;
            }
            System.out.println(ans);
        }
        
    }
}