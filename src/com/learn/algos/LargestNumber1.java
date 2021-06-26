package com.learn.algos;

public class LargestNumber1 {
    
   public static void main(String[] args) {
       int sumOfDigits = 20;
       int numOfDigits = 3;
       
       int largestNumber = findLargestNumber(sumOfDigits,numOfDigits);
       System.out.println(largestNumber);
}
    
    

    static int findLargestNumber(int sumOfDigits, int numOfDigits) {
	// TODO Auto-generated method stub
	if(sumOfDigits == 0) return 000;
	
	if(sumOfDigits > 9*numOfDigits) return -1;
	
	int start = (int) Math.pow(10, (numOfDigits-1));
	int end = (int) Math.pow(10, numOfDigits);
	int max = 0;
       while(start < end)
       {
	   
	   if(sumOfDigits(start) == sumOfDigits) 
	       {
	           if(max < start) max = start;
	       }
	   start++;
	   
       }
       
       return max;
	
	
    }

    static int sumOfDigits(int start) {
	// TODO Auto-generated method stub
	int sum =0;
	
	while(start != 0)
	{
	    sum = sum+ start%10;
	    start = start/10;
	}
	
	return sum;
    }

}
