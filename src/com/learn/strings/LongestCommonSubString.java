package com.learn.strings;

public class LongestCommonSubString {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	findLCSLength("passport","ppsspt");
    }

    private static void findLCSLength(String str1, String str2) {
	// TODO Auto-generated method stub
	if( str1.length() == 0 || str2.length() ==0)
	{
	    System.out.println("Input wrong");
	}
	int[][] L = new int[str1.length()+1][str2.length()+1];
	int maxLength = 0;
	for(int i =1;i<str1.length();i++)
	{
	    for(int j =1;j<str2.length();j++)
	    {
		if(str1.charAt(i) == str2.charAt(j)) 
		{
		    L[i][j] = 1 + L[i-1][j-1];
		    maxLength = Math.max(maxLength, L[i][j]);
		}
	    }
	    
	}
	System.out.println(maxLength);
	
    }

}
