package com.learn.linkedlists;

public class UnionIntersection {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node n1 = new Node(15,null);
	Node n2 = new Node(22,null);
	Node n3 = new Node(8,null);
	Node n4 = new Node(8,null);
	Node n5 = new Node(14,null);
	Node n6 = new Node(22,null);
	n1.next = n2;
	n2.next = n3;
	
	n4.next = n5;
	n5.next = n6;
	
	Node output = Union(n1,n4);
	InsertAtEnd.printLinkedList(output);
	Node intersection = Intersection(n1,n4);
    }

    private static Node Intersection(Node n1, Node n4) {
	// TODO Auto-generated method stub
	Node output = null;
	while(n1!=null)
	{
	    while(n4 !=null)
	    {
		if(n1.data == n4.data) 
		    {
		    if(output==null) output.data = n1.data;
		 
		    }
	    }
	}
	return output;
    }

    private static Node Union(Node list1, Node list2) {
	// TODO Auto-generated method stub
	Node head = list1;
	while(list1.next!=null )
	{
	   list1 = list1.next;
	}
	list1.next = list2;
	
	return list1;
    }

}
