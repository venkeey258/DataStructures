package com.learn.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class NthNode {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node n1 = new Node(22,null);
	Node n2 = new Node(18,null);
	Node n3 = new Node(60,null);
	Node n4 = new Node(78,null);
	Node n5 = new Node(47,null);
	Node n6 = new Node(39,null);
	Node n7 = new Node(99,null);
	
	n1.next = n2;n2.next=n3;n3.next=n4;
	n4.next=n5;n5.next=n6;n6.next=n7;
	
	int endKey = 3;
	
	NthNode(n1,endKey);
	
	
	
    }

    private static void NthNode(Node n1, int endKey) {
	// TODO Auto-generated method stub
	List<Integer> arr = new ArrayList<Integer>();
	while(n1!=null)
	{
	    arr.add((int)n1.data);
	    n1 = n1.next;
	}
	System.out.println(arr.get(arr.size()-endKey));
	
    }

}
