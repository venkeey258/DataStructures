package com.learn.linkedlists;

public class InsertAtEnd {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node n1 = new Node(1,null);
	Node n2 = new Node(2,null);
	Node n3 = new Node(3,null);
	n1.next = n2;
	n2.next = n3;
	int data = 10;
	
	
	insertAtEnd(data,n1);
	printLinkedList(n1);
	
    }

    private static <T> void insertAtEnd(T data,Node head) {
	// TODO Auto-generated method stub
	Node newnode = new Node(data,null);
	while(head.next != null)
	{
	    head = head.next;
	}
	head.next = newnode;
	
	
    }

     static void printLinkedList(Node n1) {
	// TODO Auto-generated method stub
	Node head =n1;
	while(head != null)
	{
	    System.out.println(head.data);
	    head = head.next;
	}
    }
    
    

}

class Node<T>{
    
    T data;
    Node next;
    
    Node(){}
    
    public Node(T data, Node next) {
	
	this.data = data;
	this.next = next;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
   
    
    
}
