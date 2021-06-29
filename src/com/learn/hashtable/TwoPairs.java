package com.learn.hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoPairs {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = {3, 4, 7, 1, 12, 9};
	
	String str = findPair(arr);
	System.out.println(str);
	

    }

    private static String findPair(int[] arr) {
	// TODO Auto-generated method stub
	Map<Integer,int[]> myMap = new HashMap<Integer,int[]>();
	String result=null;
	for(int i =0;i<arr.length;i++)
	{
	    for(int j=i+1;j<arr.length;j++)
	    {
		int sum = Math.addExact(arr[i],arr[j]);
		if(!myMap.containsKey(sum)) {
		myMap.put(sum,new int[]{arr[i],arr[j]});
		}
		else
		{
		    int[] prev_pair = myMap.get(sum);
		    
		    result =  "{ "+ prev_pair[0] + "," + prev_pair[1] + "}" 
			    			 + " , "+ "{ " + arr[i] + "," + arr[j] + "}" ;
		    return result;
		}
		
		
	    }
	}
	return "No Such Pairs";
    }

}
