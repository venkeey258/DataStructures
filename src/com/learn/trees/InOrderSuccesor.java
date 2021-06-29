package com.learn.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderSuccesor {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tree root = new Tree(100);
	root.left = new Tree(50);
	root.right = new Tree(200);
	root.left.left = new Tree(25);
	root.left.right=new Tree(75);
	root.right.left=new Tree(125);
	root.right.right=new Tree(350);
	int key = 350;
	List<Integer> res = new ArrayList<Integer>();
	res = InOrderSuccesor(root,res);
	System.out.println(res);
	List<List<Integer>> finalr = new ArrayList<List<Integer>>();
	for(int i =0;i<res.size();i++)
	{
	   List<Integer> temp = new ArrayList<Integer>();
	   if(i<res.size()-1) {
	       temp.add(res.get(i));
	       temp.add(res.get(i+1));
	      finalr.add(temp);
	   }else
	   {
	       temp.add(res.get(i));
	       temp.add(null);
	       finalr.add(temp);
	   }
	   
	}
	System.out.println(finalr);
    }

    private static List<Integer> InOrderSuccesor(Tree root,List<Integer> res) {
	// TODO Auto-generated method stub
	if(root == null) return res;
	
	if(root!=null)
	{
	    InOrderSuccesor(root.left,res);
	    res.add(root.data);
	    InOrderSuccesor(root.right,res);
	    
	}
	return res;
	
	
    }
}
