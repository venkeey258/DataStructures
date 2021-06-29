package com.learn.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingInteger {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = {2,54,7,2,6,54};
	
	System.out.println(findFirstUnique(arr));;
    }

    private static int findFirstUnique(int[] arr) {
	// TODO Auto-generated method stub
	Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
	int min = Integer.MAX_VALUE;
	for(int i =0;i<arr.length;i++)
	{
	    if(myMap.containsKey(arr[i]))myMap.remove(arr[i]);
	    else myMap.put(arr[i], i);
	}
	for(Entry<Integer,Integer> entry: myMap.entrySet())
	{
	   min = Math.min(min, entry.getValue());
	}
	return arr[min];
	
	
    }

}
