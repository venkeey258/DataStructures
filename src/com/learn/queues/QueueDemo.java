package com.learn.queues;

public class QueueDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Queue<Integer> Q = new Queue<Integer>(3);
	System.out.println(Q.isEmpty());
	System.out.println(Q.isFull());
	System.out.println(Q.dequeue());
	Q.enqueue(1);
	Q.enqueue(2);
	Q.enqueue(3);
	Q.enqueue(4);
	System.out.println(Q.dequeue());
	System.out.println(Q.dequeue());
	System.out.println(Q.dequeue());
	System.out.println(Q.dequeue());
	System.out.println(Q.dequeue());
	
    }

}
