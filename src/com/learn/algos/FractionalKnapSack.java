package com.learn.algos;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	DecimalFormat newdecimal = new DecimalFormat("#.##");
	double[] weights = {2,1,6,0.5,0.25,7};
	double[] values = {50,70,100,50,30,99};
	double capacity = 10;
	
	double maxValue = getMaxValue(weights,values,capacity);
	System.out.println("Max Value"+ newdecimal.format(maxValue));
	
	
    }

    private static double getMaxValue(double[] w, double[] v, double capacity) {
	// TODO Auto-generated method stub
	int totalItems = v.length;
	ItemValue[] iVal = new ItemValue[totalItems];
	
	for(int i =0;i<totalItems;i++)
	{
	    iVal[i] = new ItemValue(w[i],v[i],i);
	}
	
	Arrays.sort(iVal, new Comparator<ItemValue>()
		{
	    	   @Override
		    public int compare(ItemValue o1, ItemValue o2) {
			// TODO Auto-generated method stub
			return o2.cost.compareTo(o1.cost);
		    }
	    		
		});
	
	double totalValue = 0;
	for(ItemValue i: iVal)
	{
	    double currWeight = (double)i.w;
	    double currValue = (double)i.v;
	    
	    if(capacity-currWeight >= 0)
	    {
		capacity = capacity-currWeight;
		totalValue += currValue;
		System.out.println("c, v, t ="+ capacity +",  "+ currValue + ",  "+ totalValue);
	    }
	    else
	    {
		double fraction = ((double) capacity / (double) currWeight);
		totalValue += (currValue * fraction);
		capacity = (double)(capacity - (currWeight*fraction));
		System.out.println("c, v, t ="+ capacity +",  "+ currValue + ",  "+ totalValue+ "\n");
		break;
		
	    }
	    
	}
	return totalValue;
    }
    
    static class ItemValue{
	Double cost;
	double w,v,i;
	public ItemValue(double w, double v, double i) {
	    this.w = w;
	    this.v = v;
	    this.i = i;
	    cost = new Double(v/w);
	}
	
	
    }

}
