package com.learn.stacks;

public class StacksUsingArrays {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	

    }

}

class TwoStacks<V>{
    
    V[] array;
    int maxSize;
    int top1,top2;
    
    TwoStacks(int maxSize){
	 this.maxSize=maxSize;
	 array = (V[])new Object[maxSize];
	 top1=-1;
	 top2=maxSize;
	 
     }
    
    public void push1(V value) {
	if(top1 < top2-1)  array[++top1]=value;
	
    }
    public void push2(V value) {
	if(top1 < top2-1 ) array[--top2]=value;
    }
    
    public V pop1() {
	return array[top1--];
    }
    
    public V pop2() {
   	return array[top2++];
       }
    
    
}
