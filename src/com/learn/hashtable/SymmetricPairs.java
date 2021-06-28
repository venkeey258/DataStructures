package com.learn.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymmetricPairs {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
	System.out.println(arr.length);
	for(int i=0;i<arr.length;i++)
	{
	    int key = arr[i][0];
	    int value = arr[i][1];
	   if(myMap.containsValue(key) && myMap.containsKey(value))
	    {
	       List<Integer> res = new ArrayList<Integer>();
	       res.add(value);
	       res.add(key);
	       result.add(res);
	   }
	   else {
	    myMap.put(arr[i][0], arr[i][1]);
	   }
	}
	System.out.println(result);
    }

}
