package com.learn.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    
    int data;
    Tree left;
    Tree right;
    
    Tree(int data){
	this.data = data;
	
    }

    public Tree() {
	// TODO Auto-generated constructor stub
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
    
   static void reverseLevelOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	Queue<Tree> myQ = new LinkedList<Tree>();
	Stack<Tree> myS = new Stack<Tree>();
	myQ.add(root);
	while(!myQ.isEmpty()) {
	    Tree node = myQ.poll();
	    myS.push(node);
	    if(node.right!=null) myQ.add(node.right);
	    if(node.left!=null) myQ.add(node.left);
	   
	}
	
	
	while(!myS.isEmpty())
	{
	    System.out.print(myS.pop().data+ "  ");
	}
	
	
	
    }

    public static void levelOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	Queue<Tree> myQ = new ArrayDeque<Tree>();
	Tree dummy = new Tree();
	myQ.add(root);
	myQ.add(dummy);
	while(!myQ.isEmpty()) {
	    Tree node = myQ.poll();
	    System.out.print(node.data+ "  ");
	    if(node.left!=null) myQ.add(node.left);
	    if(node.right!=null) myQ.add(node.right);
	    if(myQ.peek() == dummy)
	    {
		System.out.println();
		myQ.remove(dummy);
		
		if(!myQ.isEmpty())
		{
		    myQ.add(dummy);
		}
	    }
	}
	
    }

    public static void postOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	if(root!=null) {
	    
	    postOrderTraversal(root.left);
	    postOrderTraversal(root.right);
	    System.out.print(root.data+ "  ");
	}
	
    }

    public static void preOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	if(root!=null) {
	    System.out.print(root.data+ "  ");
	    preOrderTraversal(root.left);
	    preOrderTraversal(root.right);
	}
    }

    public static void inOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	if(root!=null) {
	    inOrderTraversal(root.left);
	    System.out.print(root.data+ "  ");
	    inOrderTraversal(root.right);
	}
	
	
    }
    
    

}
