package com.learn.strings;

public class MinimumDeletions {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str1 = "abdca";
	String str2 = "cbda";
	int c1 = findMDI(str1,str2);
	System.out.println(c1);
    }

    private static int findMDI(String str1, String str2) {
	// TODO Auto-generated method stub
	int maxLength = 0;
	int[][] dp = new int[str1.length()+1][str2.length()+1];
	for(int i =1;i<=str1.length();i++)
	{
	    for(int j =1;j<=str2.length();j++)
	    {
		if(str1.charAt(i-1) == str2.charAt(j-1))
		{
		    dp[i][j] = 1+dp[i-1][j-1];
		}
		else
		{
		    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
		   
		}
		 maxLength = Math.max(maxLength, dp[i][j]);
	    }
	    
	}
	return maxLength;
	
    }

}
