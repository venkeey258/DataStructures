package com.learn.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInOrder {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*Tree root = new Tree(1);
	root.left = new Tree(2);
	root.right = new Tree(3);
	root.left.left = new Tree(4);
	root.right.left=new Tree(6);
	root.right.right=new Tree(7);
	root.left.right=new Tree(5);*/
	
	Tree root1 = new Tree(100);
	root1.left=new Tree(50);
	root1.right=new Tree(200);
	root1.left.left=new Tree(25);
	root1.left.right=new Tree(75);
	root1.right.left=new Tree(90);
	root1.right.right=new Tree(350);
	IterativeInOrderTraversal(root1);
	//Tree.levelOrderTraversal(root);
	//Tree.reverseLevelOrderTraversal(root);
    }

    private static void IterativeInOrderTraversal(Tree root) {
	// TODO Auto-generated method stub
	Stack<Tree> myS = new Stack<Tree>();
	List<Integer> result = new ArrayList<Integer>();
	while(root!=null)
	{
	    myS.push(root);
	    root = root.left;
	}
	while(!myS.isEmpty())
	{
	    Tree val = myS.pop();
	    Tree temp = val.right;
	    if(temp!=null) myS.push(temp);
	    result.add(val.data);
	}
	
	System.out.println(result);
    }

}
