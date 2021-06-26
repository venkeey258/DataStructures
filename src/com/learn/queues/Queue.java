package com.learn.queues;

public class Queue<V> {
    
    int maxSize;

    V array[];
    int front;
    int back;
    int currSize;
    
    Queue(int maxSize){
	this.maxSize = maxSize;
	this.currSize = 0;
	array = (V[])new Object[maxSize];
	front = 0;
	back = -1;
	
    }
    
    public boolean isEmpty() {
	return currSize == 0;
    }
    public boolean isFull() {
	return currSize == maxSize;
    }
    
    public V top() {
	if(isEmpty()) return null;
	return array[front];
	
    }
    public void enqueue(V value) {
	if(isFull())  {
	    System.err.println("Queue is Full");
	    return;
	    }
	back = (back+1)%maxSize;
	array[back] = value;
	currSize++;
    }
    public V dequeue() {
	if(isEmpty()) {
	    System.err.println("Queue is empty");
	    return null;
	}
	
	V temp = array[front];
	front = (front+1)%maxSize;
	currSize--;
	
	return temp;
    }
    

}
