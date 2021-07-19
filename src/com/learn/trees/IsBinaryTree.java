package com.learn.trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class IsBinaryTree {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tree root1 = new Tree(100);
	root1.left=new Tree(50);
	root1.right=new Tree(200);
	root1.left.left=new Tree(25);
	root1.left.right=new Tree(75);
	root1.right.left=new Tree(90);
	root1.right.right=new Tree(350);
	
	System.out.println(isBinaryTree(root1));
    }

    private static boolean isBinaryTree(Tree root) {
	// TODO Auto-generated method stub
	return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(Tree node, int min, int max) {
	// TODO Auto-generated method stub
	/* an empty tree is BST */
        if (node == null)
            return true;
 
        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;
 
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }

}
