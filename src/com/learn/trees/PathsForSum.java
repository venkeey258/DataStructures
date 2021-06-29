package com.learn.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PathsForSum {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*Tree root = new Tree(12);
	root.left = new Tree(7);
	root.right = new Tree(1);
	root.left.left = new Tree(4);
	root.right.left=new Tree(10);
	root.right.right=new Tree(5);*/
	Tree root = new Tree(1);
	root.left = new Tree(2);
	root.right =new Tree(3);
	root.left.left=new Tree(4);
	root.right.right=new Tree(5);
	
	int sum = 23;
	
	
	preOrderTraversal(root);
	System.out.println();
	inOrderTraversal(root);
	System.out.println();
	postOrderTraversal(root);
	System.out.println();
	levelOrderTraversal(root);
	System.out.println();
	reverseLevelOrderTraversal(root);
	System.out.println();
	InOrderIterator iter = new InOrderIterator(root);
	String result = "";
	while(iter.hasNext())
	{
	    result += iter.getNext().data+" ";
	}
	System.out.println(result);
	
	
	
	//result = FindAllTreePaths(root,sum);
	
	
    }

    private static void reverseLevelOrderTraversal(Tree root) {
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
	    System.out.print(myS.pop().data);
	}
	
	
	
    }

    private static void levelOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	Queue<Tree> myQ = new LinkedList<Tree>();
	myQ.add(root);
	while(!myQ.isEmpty()) {
	    Tree node = myQ.poll();
	    System.out.print(node.data);
	    if(node.left!=null) myQ.add(node.left);
	    if(node.right!=null) myQ.add(node.right);
	}
	
    }

    private static void postOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	if(root!=null) {
	    
	    postOrderTraversal(root.left);
	    postOrderTraversal(root.right);
	    System.out.print(root.data);
	}
	
    }

    private static void preOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	if(root!=null) {
	    System.out.print(root.data);
	    preOrderTraversal(root.left);
	    preOrderTraversal(root.right);
	}
    }

    private static void inOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	if(root!=null) {
	    inOrderTraversal(root.left);
	    System.out.print(root.data);
	    inOrderTraversal(root.right);
	}
	
    }

    private static List<List<Integer>> FindAllTreePaths(Tree root, int sum) {
	// TODO Auto-generated method stub
	return null;
    }

}
