package com.learn.linkedlists;

public class SearchLinkedList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node n1 = new Node(5,null);
	Node n2 = new Node(90,null);
	Node n3 = new Node(10,null);
	Node n4 = new Node(4,null);
	n1.next = n2;
	n2.next = n3;
	n3.next = n4;
	int key = 90;
	
	//System.out.println(SearchNode(key,n1));
	
	//deleteByValue(key,n1);
	//InsertAtEnd.printLinkedList(n1);
	//System.out.println(CalcLength(n1));
	InsertAtEnd.printLinkedList(n1);
	ReverseLinkedList(n1);
	InsertAtEnd.printLinkedList(n4);
    }

    private static void ReverseLinkedList(Node head) {
	// TODO Auto-generated method stub
	
	Node prev = null;
	Node curr = null;;
	while(head != null)
	{
	    curr = head.next;
	    head.next = prev;
	    prev = head;
	    head = curr;
	
	}
	
	
    }

    private static int CalcLength(Node head) {
	// TODO Auto-generated method stub
	int i =0;
	while(head!=null)
	{
	    i++;
	    head = head.next;
	}
	return i;
    }

    private static void deleteByValue(int key, Node head) {
	// TODO Auto-generated method stub
	Node prev = head;
	while(head != null)
	{
	 if((int)head.data == key) 
	    {
		prev.next = head.next;
		head = prev;
	     }
	 	head = head.next;
	}
}

    private static<T> String SearchNode(int key,Node head) {
	// TODO Auto-generated method stub
	while(head != null)
	{
	    if((int)head.data == key) return "Found";
	    else head = head.next;
	}
	
	return "Not Found";
	
    }

}


