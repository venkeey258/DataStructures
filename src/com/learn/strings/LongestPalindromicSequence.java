package com.learn.strings;

public class LongestPalindromicSequence {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str = "abdbca"; 
	//System.out.println(LPS(str,0,str.length()-1));
	int[][] L = new int[str.length()][str.length()];
	System.out.println(TPDLPS(L,str,0,str.length()-1));
    }

    private static int TPDLPS(int[][] L,String str, int i, int j) {
	// TODO Auto-generated method stub
	
	if( i > j) return 0;
	
	if(i==j) return 1;
	
	
	if(str.charAt(i) == str.charAt(j))
	    L[i][j] = 2 + TPDLPS(L,str,i+1,j-1);
	else
	    L[i][j] = Math.max(TPDLPS(L,str,i+1,j), TPDLPS(L,str,i,j-1));
	
	return L[i][j];
    }

    private static int LPS(String str,int start,int end) {
	// TODO Auto-generated method stub
	if(start > end) return 0;
	if( start == end) return 1;
	if(str.charAt(start) == str.charAt(end))
	    return 2+LPS(str,start+1,end-1);
	else
	    return Math.max(LPS(str,start+1,end), LPS(str,start,end-1));
	
    }

}
