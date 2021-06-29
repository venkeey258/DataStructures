package com.learn.trees;

public class IdenticalBinaryTrees {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tree root1 = new Tree(100);
	root1.left=new Tree(50);
	root1.right=new Tree(200);
	root1.left.left=new Tree(25);
	root1.right.left=new Tree(125);
	root1.right.right=new Tree(350);
	
	Tree root2 = new Tree(1);
	root2.left=new Tree(2);
	root2.right=new Tree(200);
	root2.left.left=new Tree(25);
	root2.right.left=new Tree(125);
	root2.right.right=new Tree(350);
	
	Tree.preOrderTraversal(root1);
	System.out.println();
	Tree.preOrderTraversal(root2);
	System.out.println(areIdentical(root1,root2));
    }

    private static boolean areIdentical(Tree root1, Tree root2) {
	// TODO Auto-generated method stub
	if(root1 == null || root2 == null) return true;
	
	if(root1 != null &&  root2 !=null)
	{
	   return (root1.data == root2.data) &&  areIdentical(root1.left,root2.left) &&
	    areIdentical(root1.right,root2.right);
	}
	return false;

    }

}
