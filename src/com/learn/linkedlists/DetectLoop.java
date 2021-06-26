package com.learn.linkedlists;

public class DetectLoop {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node n1 = new Node(7,null);
	Node n2 = new Node(4,null);
	Node n3 = new Node(21,null);
	Node n4 = new Node(7,null);
	n1.next = n2;
	n2.next = n3;
	n3.next = n4;
	//n4.next = n1;
	
	System.out.println(detectLoop(n1));
    }

    private static boolean detectLoop(Node head) {
	// TODO Auto-generated method stub
	Node slow = head;
	Node fast = head;
	while(slow!=null && fast!=null  && fast.next!=null)
	{
	    slow = slow.next;
	    fast = fast.next.next;
	    
	    if(slow==fast)return true;
	}
	return false;    
	
    }

}
