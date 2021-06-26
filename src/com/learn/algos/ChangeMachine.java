package com.learn.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeMachine {
    
    public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		List<Integer> output  = new ArrayList<Integer>();
		getMinCoins(amount,output);
		System.out.println(output);
}

    

    private static List<Integer> getMinCoins(int amount,List<Integer> output) {
	// TODO Auto-generated method stub
	int[] coins = {25,10,5,1};
	for(int i =0;i<coins.length & amount > 0;i++)
	{
	    while(amount >= coins[i])
	    {
		amount = amount-coins[i];
		output.add(coins[i]);
	    }
	}
	return output;
	
	
    }

}
