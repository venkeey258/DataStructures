package com.learn.trees;

import java.util.Stack;

public class InOrderIterator {
    
    Stack<Tree> myS = new Stack<Tree>();

    public InOrderIterator(Tree root) {
	populateIterator(root);
    }
    
    private void populateIterator(Tree root) {
	// TODO Auto-generated method stub
	while(root !=null)
	{
	    myS.push(root);
	    root = root.left;
	}
	
    }

    public boolean hasNext() {
	return !myS.isEmpty();
    }
    
    public Tree getNext() {
	
	if(myS.empty()) return null;
	
	    Tree val = myS.pop();
	    Tree temp = val.right;
	    populateIterator(temp);
	
	return val;
    }

}


