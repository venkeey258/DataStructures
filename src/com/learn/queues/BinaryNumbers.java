package com.learn.queues;

public class BinaryNumbers {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n =7;
	String[] result = findBin(n);
	for(int i=0;i<result.length;i++)
	{
	    System.out.println(result[i]);
	}

    }

    private static String[] findBin(int n) {
	// TODO Auto-generated method stub
	String[] result = new String[n];
	Queue<String> queue = new Queue<String>(n+1);
	queue.enqueue("1");
	for(int i=0;i<n;i++)
	{
	    result[i] = queue.dequeue();
	    String s1=result[i]+"0";
	    String s2=result[i]+"1";
	    queue.enqueue(s1);
	    queue.enqueue(s2);
	    
	}
	return result;
	
    }

}
