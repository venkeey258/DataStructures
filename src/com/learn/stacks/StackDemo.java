package com.learn.stacks;

public class StackDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Stack<Integer> newstack = new Stack<Integer>(4);
	System.out.println(newstack.isEmpty());
	System.out.println(newstack.isFull());
	System.out.println(newstack.pop());
	System.out.println(newstack.top());
	newstack.push(1);
	newstack.push(3);
	newstack.push(4);
	newstack.push(2);
	newstack.push(2);
	System.out.println(newstack.pop());
	System.out.println(newstack.pop());
	System.out.println(newstack.pop());
	System.out.println(newstack.pop());
	System.out.println(newstack.pop());
	System.out.println(newstack.pop());
	System.out.println(newstack.pop());
	
	
    }

}
