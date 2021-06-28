package com.learn.strings;

public class PalindromeSubStrings {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str = "aabbbaa";
	findAllPalindromeSubStrings(str);
    }

    private static void findAllPalindromeSubStrings(String str) {
	// TODO Auto-generated method stub
	int count = 0;
	for(int i =0;i<str.length();i++)
	{
	    for(int j =i+1;j<str.length();j++)
	    {
		if(isPalindrome(str,i,j))
		{
		    System.out.println(str.substring(i, j+1));
		    count++;
		    
		}
	    }
	    System.out.println(count);
	}
	
    }

    private static boolean isPalindrome(String str, int i, int j) {
	// TODO Auto-generated method stub
	while(j > i)
	{
	    if(str.charAt(i) != str.charAt(j)) return false;
	    i++;
	    j--;
	}
	return true;
    }

}
