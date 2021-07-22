package com.learn.heaps;

public class FindKthSmallest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] input = {9,4,7,1,-2,6,5};
	int[] output = findKSmallest(input,2);
	for(int i=0;i<output.length;i++)
	{
	    System.out.println(output[i]);
	}
	

    }

    private static int[] findKSmallest(int[] input, int k) {
	// TODO Auto-generated method stub
	int arraySize = input.length;
	if(k<= arraySize) {
	    int[] result = new int[k];
	    for(int i =0;i<k;i++) {
		result[i]=removeMin(input,arraySize);
		--arraySize;
	    }
	    return result;
	}
	System.out.println("Value of K="+k+"out of Bounds");
	return input;
    }

    private static int removeMin(int[] input, int arraySize) {
	// TODO Auto-generated method stub
	buildMinHeap(input,arraySize);
	int min = input[0];
	input[0]=input[arraySize-1];
	return min;
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
