package com.learn.trees;

public class ConnectLevelOrder {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tree root = new Tree(12);
	root.left = new Tree(7);
	root.right = new Tree(1);
	root.left.left = new Tree(9);
	root.right.left=new Tree(10);
	root.right.right=new Tree(5);

    }

}
