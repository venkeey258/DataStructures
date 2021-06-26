package com.learn.algos;

import java.util.ArrayList;
import java.util.List;

public class PoliceThief {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int policeThiefArray[] = {'P', 'T', 'T', 'P', 'T'};
	int k =2;
	int count = 0;
	List<Integer> police = new ArrayList<Integer>();
	List<Integer> thieves = new ArrayList<Integer>();
	
	for(int i =0;i<policeThiefArray.length;i++)
	{
	    if(policeThiefArray[i] == 'P') police.add(i);
	    else if (policeThiefArray[i] == 'T') thieves.add(i);
	}
	
	int policeCount = police.size();
	int thiefCount = thieves.size();
	int i = 0,j =0,result =0;
	while(i < policeCount && j <thiefCount)
	{
	    if(Math.abs(police.get(i)-thieves.get(i)) <= k)
	    {
		result++;
		i++;
		j++;
	    }
	    else if(police.get(i) < thieves.get(i))
	    {
		i++;
	    }
	    else 
		{j++;}
	}
	System.out.println(result);
	
	
    }

}
