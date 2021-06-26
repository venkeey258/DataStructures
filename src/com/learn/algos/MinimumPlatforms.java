package com.learn.algos;

import java.util.Arrays;

public class MinimumPlatforms {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                           + findPlatform(arr, dep, n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
	// TODO Auto-generated method stub
	Arrays.sort(arr);
	Arrays.sort(dep);
	
	int platformsNeeded = 1;
	int result =1;
	int i = 1,j =0;
	
	while(i < n && j< n)
	{
	    if(arr[i] <= dep[j])
	    {
		platformsNeeded++;
		i++;
	    }else if(arr[i] > dep[j])
	    {
		platformsNeeded--;
		j++;
	    }
	    
	   result = Math.max(platformsNeeded, result);
	}
	 return result;
	
	
    }

}
