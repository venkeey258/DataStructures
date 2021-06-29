package com.learn.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TracePath {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Map<String,String> myMap = new HashMap<String,String>();
	myMap.put("Vizag", "Andaman");
	myMap.put("Bangalore", "Mumbai");
	myMap.put("Pune", "Vizag");
	myMap.put("Mumbai", "Pune");
	
	tracePath(myMap);
	

    }

    private static void tracePath(Map<String, String> myMap) {
	// TODO Auto-generated method stub
	Map<String,String> reverseMap = new HashMap<String,String>();
	String from = null;
	String to = null;
	for(Entry<String, String> entry: myMap.entrySet())
	{
	    reverseMap.put(entry.getValue(), entry.getKey());
	}
	
	for(Entry<String, String> entry: myMap.entrySet())
	{
	    if(!reverseMap.containsKey(entry.getKey()))
	    {
		from = entry.getKey();
	    }
	}
	to = myMap.get(from);
	while(to!=null)
	{
	    System.out.println(from +"  ->  "+ to);
	   from = to;
	   to = myMap.get(from);
	}
	
    }

}
