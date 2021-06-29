package com.learn.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tree root = new Tree(12);
	root.left = new Tree(7);
	root.right = new Tree(1);
	root.left.right = new Tree(9);
	root.right.left=new Tree(10);
	root.right.right=new Tree(5);
	root.right.left.left=new Tree(20);
	root.right.left.right=new Tree(17);
	
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	result = ZigZag(root);
	System.out.println(result);
	
    }

    private static List<List<Integer>> ZigZag(Tree root) {
	// TODO Auto-generated method stub
	Queue<Tree> myQ = new ArrayDeque<Tree>();
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	Tree dummy = new Tree();
	myQ.offer(root);

	boolean leftoright = true;
	while(!myQ.isEmpty())
	{
	    List<Integer> templst = new ArrayList<Integer>();
	    int levelSize = myQ.size();
	    for(int i =0;i<levelSize;i++) {
		Tree curr = myQ.poll();
		
		if(leftoright) templst.add(curr.data);
		else templst.add(0,curr.data);
		
		if(curr.left!=null) myQ.add(curr.left);
		if(curr.right!=null) myQ.add(curr.right);
	    }
	    result.add(templst);
	    leftoright = !leftoright;
	}
	return result;
 }

}
