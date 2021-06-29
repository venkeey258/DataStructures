package com.learn.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelAverages {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*Tree root = new Tree(12);
	root.left = new Tree(7);
	root.right = new Tree(1);
	root.left.left = new Tree(9);
	root.right.left=new Tree(10);
	root.right.right=new Tree(5);
	root.left.right=new Tree(2); */
	Tree root  = new Tree(4); 
	    root.left = new Tree(2); 
	    root.right = new Tree(9); 
	    root.left.left = new Tree(3); 
	    root.left.right = new Tree(5); 
	    root.right.right = new Tree(7);
	List<Double> res = findLevelAverages(root);
	System.out.println(res);

    }

    private static List<Double> findLevelAverages(Tree root) {
	// TODO Auto-generated method stub
	Queue<Tree> myQ = new ArrayDeque<Tree>();
	List<Double> res = new ArrayList<Double>();
	Tree dummy = new Tree();
	myQ.add(root);
	int level = 1;
	myQ.add(dummy);
	int sum =0;
	while(!myQ.isEmpty())
	{
	    Tree temp = myQ.poll();
	    if(temp.left !=null) myQ.add(temp.left);
	    if(temp.right !=null) myQ.add(temp.right);
	    sum += temp.data;
	    if(myQ.peek() == dummy)
	    {
		res.add((sum*1.0/level));
		level++;
		myQ.remove(dummy);
		sum = 0;
		 if(!myQ.isEmpty()) {
			myQ.add(dummy);
		    }
	    }
	   
	    
	    
	}
	return res;
    }

}
