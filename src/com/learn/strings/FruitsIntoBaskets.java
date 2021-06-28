package com.learn.strings;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	char[] fruits = {'A','B','C','B','A','C'};
	MaxFruitCountOfTwoTypes(fruits);
    }

    private static void MaxFruitCountOfTwoTypes(char[] fruits) {
	// TODO Auto-generated method stub
	int windowStart = 0,windowEnd = 0,maxLength=0;
	Map<Character,Integer> charMap = new HashMap<Character,Integer>();
	
	for(windowEnd=0;windowEnd<fruits.length;windowEnd++)
	{
	    char ch = fruits[windowEnd];
	    charMap.put(ch, charMap.getOrDefault(fruits[windowEnd], 0)+1);
	    while(charMap.size() > 2)
	    {
		charMap.put(fruits[windowStart], charMap.get(fruits[windowStart])-1);
		if(charMap.get(fruits[windowStart])== 0)
		{
		    charMap.remove(fruits[windowStart]);
		}
		windowStart++;
	    }
	    maxLength = Math.max(maxLength, windowEnd-windowStart+1);
	}
	System.out.println(maxLength);
    }

}
