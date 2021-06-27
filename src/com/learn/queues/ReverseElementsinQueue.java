package com.learn.queues;

import com.learn.stacks.Stack;

public class ReverseElementsinQueue {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Queue<Integer> Q = new Queue<Integer>(10);
	for(int i =1;i<=10;i++)
	{
	    Q.enqueue(i);
	}
	int k = 5;
	Q=  reverseK(Q,k);
	while(!Q.isEmpty()) {
	    System.out.println(Q.dequeue());
	}
	

    }

    private static Queue<Integer> reverseK(Queue<Integer> q, int k) {
	// TODO Auto-generated method stub
	Stack<Integer> S = new Stack<Integer>(k);
	while(!S.isFull()){
	    S.push(q.dequeue());
	   
	}
	while(!S.isEmpty()) {
	    q.enqueue(S.pop());
	}
	for(int i =0;i<q.Size()-k;i++) {
		q.enqueue(q.dequeue());
	}
	 return q;   
	
	
    }

}
