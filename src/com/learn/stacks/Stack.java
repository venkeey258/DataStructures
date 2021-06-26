package com.learn.stacks;

public class Stack<V> {
    	private int maxSize;
    	private int top;
    	private V array[];
    	
    	public Stack(int maxSize)
    	{
    	    this.maxSize = maxSize;
    	    this.top = -1;
    	    array = (V[])new Object[maxSize];
    	}
    	
    	public boolean isEmpty() {
    	   return top == -1;
    	}
    	
    	
    	public boolean isFull() {
    	    return top == maxSize-1;
    	}
    	
    	public V top() {
    	    if(isEmpty()) return null;
    	    return array[top];
    	}
    	
    	public void push(V value) {
    	    if(isFull()) {
    		System.err.println("Stack is Full");
    		return;
    	    }
    	    array[++top]=value;
    	}
    	public V pop() {
    	    if(isEmpty()) {
    		System.err.println("Stack is Empty");
    		return null;
    	    }
    	    return array[top--];
    	}
    	
    	
}
