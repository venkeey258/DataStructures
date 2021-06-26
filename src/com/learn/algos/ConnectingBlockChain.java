package com.learn.algos;

import java.util.Arrays;

public class ConnectingBlockChain {
    
    public static void main(String[] args) {
		int[] chain = {4, 2, 3, 7};
		Arrays.sort(chain);
		int cost = 0;
		
		int finalcost = 0;
		for(int i =0;i<chain.length-1;i++)
		{
		    int prev_cost = cost;
		    cost =(chain[i]+chain[i+1]);
		    chain[i+1]=cost;
		   cost = cost + prev_cost;
		}
		System.out.println(cost);
    }

   

}
