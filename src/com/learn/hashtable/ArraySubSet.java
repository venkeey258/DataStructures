package com.learn.hashtable;

import java.util.HashSet;
import java.util.Set;

public class ArraySubSet {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr1 = {9,4,7,1,-2,6,5};
	int[] arr2 = {7,10,8};
	
	//boolean output = isSubSet(arr1,arr2);
	boolean output = isDisJoint(arr1,arr2);
	System.out.println(output);
    }

    private static boolean isDisJoint(int[] arr1, int[] arr2) {
	// TODO Auto-generated method stub
	Set<Integer> mySet = new HashSet<Integer>();
	for(int i = 0;i<arr1.length;i++)
	{
	    mySet.add(arr1[i]);
	}
	for(int j =0;j<arr2.length;j++)
	{
	    if(mySet.contains(arr2[j])) {
		return false;
	    }
	    else
	    {
		mySet.add(arr2[j]);
	    }
	}
	
	if(mySet.size() == (arr1.length+arr2.length)) return true;
	return false;
    }

    private static boolean isSubSet(int[] arr1, int[] arr2) {
	// TODO Auto-generated method stub
	Set<Integer> mySet = new HashSet<Integer>();
	for(int i = 0;i<arr1.length;i++)
	{
	    mySet.add(arr1[i]);
	}
	int count = 0;
	for(int j =0;j<arr2.length;j++)
	{
	    if(mySet.contains(arr2[j])) count++;
	}
	if(count == arr2.length) return true;
	return false;
	
    }

}
