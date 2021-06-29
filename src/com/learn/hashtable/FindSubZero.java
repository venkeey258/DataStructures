package com.learn.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FindSubZero {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = {6, 4, -7, 3, 12, 9};
	Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
	int sum =0;
	for(int i =0;i<arr.length;i++)
	{
	    sum += arr[i];
	    if( sum ==0 || arr[i] ==0 || myMap.containsKey(sum)) {
		System.out.println(true);
	    }
	    else
	    {
		myMap.put(sum, i);
	    }
	   
	}
	
	

    }

}
