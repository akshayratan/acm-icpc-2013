//@Akshay Ratan with Algobusters Team ACM ICPC Amritapuri Regionals (C) 2013

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class wormhole_long {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int flag=0;
        int n;
        for(int i=0;i<test;i++)
        {
             n=sc.nextInt();
            long arr_input[]=new long[n];
            for(int j=0;j<n;j++)
            {
                arr_input[j]=sc.nextLong();
            }
            mergeSort(arr_input,0,n-1);  //Gives the complexity of nlogn
                
                while(n>0)
                {
                    if(arr_input[n-1]>= sum(arr_input,n))
                        n--;
                    else{
                        flag=-1;
                        break;
                }
        }
                if(n>0)
                System.out.println(n);
            else
                        System.out.println("-1");
    }
    }
    
    public static long sum(long[] arr , int n)
    {
        long s=0;
        for(int i=0;i<n-1;i++)
            s=s+arr[i];
        return s;
    }
    
    public static void mergeSort(long array[],int lo, int n){
  int low = lo;
  int high = n;
  if (low >= high) {
  return;
  }

  int middle = (low + high) / 2;
  mergeSort(array, low, middle);
  mergeSort(array, middle + 1, high);
  int end_low = middle;
  int start_high = middle + 1;
  while ((lo <= end_low) && (start_high <= high)) {
  if (array[low] < array[start_high]) {
  low++;
  } else {
  long Temp = array[start_high];
  for (int k = start_high- 1; k >= low; k--) {
  array[k+1] = array[k];
  }
  array[low] = Temp;
  low++;
  end_low++;
  start_high++;
  }
  }
  }
}