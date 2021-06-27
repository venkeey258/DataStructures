package com.learn.stacks;

public class SortStack {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Stack<Integer> S = new Stack<Integer>(7);
	S.push(23);
	S.push(60);
	S.push(12);
	S.push(42);
	S.push(4);
	S.push(97);
	S.push(2);
	
	sortStack(S);
	for(int i =0;i<7;i++)
	{
	    System.out.println(S.pop());
	}
	
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {
	// TODO Auto-generated method stub
	Stack<Integer> newStack = new Stack<Integer>(7);
	while (!stack.isEmpty()) {
	    Integer value = stack.pop();
	    if (!newStack.isEmpty() && value >= newStack.top()) {
		newStack.push(value);
	    } 
	    else 
	    {
		while (!newStack.isEmpty() && newStack.top() > value) {
		 		stack.push(newStack.pop());
		 		newStack.push(value);
		}
	    }
	}
	while (!newStack.isEmpty()) {
	    stack.push(newStack.pop());
	}
	return stack;
    }
    
}
