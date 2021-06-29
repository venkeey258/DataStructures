package com.learn.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderSuccesor {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tree root = new Tree(12);
	root.left = new Tree(7);
	root.right = new Tree(1);
	root.left.right = new Tree(9);
	root.right.left=new Tree(10);
	root.right.right=new Tree(5);
	
	int key = 10;
	
	System.out.println(findSuccesor(root,key));
	
    }

    private static int findSuccesor(Tree root, int key) {
	// TODO Auto-generated method stub
	Queue<Tree> myQ = new ArrayDeque<Tree>();
	myQ.add(root);
	while(!myQ.isEmpty())
	{
	    Tree temp = myQ.poll();
	    if(temp.left!=null) myQ.add(temp.left);
	    if(temp.right!=null) myQ.add(temp.right);
	    if(temp.data == key)
	    {
		return myQ.peek().data;
	    }
	}
	return -1;
    }

}
