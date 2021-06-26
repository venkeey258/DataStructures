package com.learn.linkedlists;

public class Palindrome {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	DoubleNode n1 = new DoubleNode(1);
	DoubleNode n2 = new DoubleNode(1);
	DoubleNode n3 = new DoubleNode(1);
	//DoubleNode n4 = new DoubleNode(2);
	
	n1.next = n2;
	n2.prev=n1;
	n2.next=n3;
	n3.prev=n2;
	//n3.next=n4;
	//n4.prev=n3;
	
	System.out.println(Palindrome(n1,n3));

    }

    private static boolean Palindrome(DoubleNode n1,DoubleNode n4) {
	// TODO Auto-generated method stub
	while(n1 != null)
	{
	    if(n1.data == n4.data)
	    {
		n1 = n1.next;
		n4 = n4.prev;
	    }
	    else
	    {
		return false;
	    }
	}
	return true;
    }

}

class DoubleNode{
    int data;
    DoubleNode next;
    DoubleNode prev;
    
    DoubleNode(int data)
    {
	this.data = data;
    }
}
