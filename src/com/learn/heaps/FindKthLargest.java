package com.learn.heaps;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] input = {9,4,7,1,-2,6,5};
	int[] output = findKLargest(input,2);
	for(int i=0;i<output.length;i++)
	{
	    System.out.println(output[i]);
	}
    }

    private static int[] findKLargest(int[] input, int k) {
	// TODO Auto-generated method stub
	int arraySize = input.length;
	if(k<= arraySize) {
	    int[] result = new int[k];
	    for(int i =0;i<k;i++) {
		result[i]=removeMax(input,arraySize);
		--arraySize;
	    }
	    return result;
	}
	System.out.println("Value of K="+k+"out of Bounds");
	return input;
    }

    private static int removeMax(int[] input, int arraySize) {
	// TODO Auto-generated method stub
	Queue<Integer> queue = new LinkedList<Integer>();
	queue = buildMaxHeap(input,arraySize);
	int max = queue.poll();
	input[0]=input[arraySize-1];
	return max;
    }

    private static Queue<Integer> buildMaxHeap(int[] input, int arraySize) {
	// TODO Auto-generated method stub
	PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
	for(int i =0;i<input.length;i++) {
	    pQueue.add(input[i]);
	}
	return pQueue;
    }

}
