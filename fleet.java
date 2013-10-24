/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshay
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fleet {

    public static void main(String[] args)throws IOException{
     
       // BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int test; //test cases
        //test=Integer.parseInt(obj.readLine());
        test= sc.nextInt();
        int arr[]=new int[test];
        for(int i=0;i<test;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int t=sc.nextInt();
            int j=0;
            int ans=0;
            while(n>0)
            {
                ans= ans+2*t;
                n=n-m;
            }
            System.out.println(ans);
        }
        
    }
}