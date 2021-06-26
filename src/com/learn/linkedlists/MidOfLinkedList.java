package com.learn.linkedlists;

public class MidOfLinkedList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node n1 = new Node(7,null);
	Node n2 = new Node(4,null);
	Node n3 = new Node(21,null);
	Node n4 = new Node(7,null);
	n1.next = n2;
	n2.next = n3;
	n3.next = n4;
	
	calcMid(n1);
    }

    private static void calcMid(Node head) {
	// TODO Auto-generated method stub
	Node slow = head;
	Node curr = head;
	
	while(curr!=null && slow!=null && curr.next!=null)
	{
	    curr = head.next.next;
	    
	    if(curr !=null) slow = slow.next;
	}
	System.out.println(slow.data);
    }

}
