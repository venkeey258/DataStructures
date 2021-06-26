package com.learn.linkedlists;

public class RemoveDuplicates {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node n1 = new Node(15,null);
	Node n2 = new Node(22,null);
	Node n3 = new Node(8,null);
	Node n4 = new Node(7,null);
	Node n5 = new Node(14,null);
	Node n6 = new Node(22,null);
	n1.next = n2;
	n2.next = n3;
	
	n4.next = n5;
	n5.next = n6;
	
	removeDuplicate(n1);
    }

    private static void removeDuplicate(Node head) {
	// TODO Auto-generated method stub
	Node curr = head;
	Node compare =null;
	while(curr != null)
	{
	    compare = curr;
	    while(curr != null)
	    {
		curr = curr.next;
		if(curr.data.equals(compare.data))
		{
		
		}
	    }
	}
    }

}
