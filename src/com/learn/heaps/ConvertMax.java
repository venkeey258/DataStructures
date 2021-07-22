package com.learn.heaps;

import java.util.Arrays;

public class ConvertMax {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] heapArray = {9,4,7,1,-2,6,5};
	System.out.println("Max Heap"+ Arrays.toString(heapArray));
	convertMax(heapArray);
	System.out.println("Min Heap"+ Arrays.toString(heapArray));
	
    }

    private static void convertMax(int[] maxHeap) {
	// TODO Auto-generated method stub
	buildMinHeap(maxHeap,maxHeap.length);
    }

    private static void buildMinHeap(int[] heapArray, int heapSize) {
	// TODO Auto-generated method stub
	for(int i =(heapSize-1)/2;i>=0;i--) {
	    minHeapify(heapArray,i,heapSize);
	}
    }

    private static void minHeapify(int[] heapArray, int index, int heapSize) {
	// TODO Auto-generated method stub
	int smallest=index;
	while(smallest<heapSize/2) {
	    int left = (2*index)+1;
	    int right= (2*index)+2;
	    if(left<heapSize && heapArray[left]<heapArray[index]) {
		 smallest = left;
	    }
	    if(right<heapSize && heapArray[right]<heapArray[smallest]) {
		smallest=right;
	    }
	    if(smallest != index) {
		int temp = heapArray[index];
		heapArray[index]=heapArray[smallest];
		heapArray[smallest] = temp;
		index = smallest;
	    }else {
		break;
	    }
	}
    }

}
