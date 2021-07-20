package com.learn.graphs;

import java.util.LinkedList;

public class NumOfEdges {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Graph g = new Graph(9);
	g.addEdge(0,2);
	g.addEdge(0,5);
	g.addEdge(2,3);
	g.addEdge(2,4);
	g.addEdge(5,3);
	g.addEdge(5,6);
	g.addEdge(3,6);
	g.addEdge(6,7);
	g.addEdge(6,8);
	g.addEdge(6,4);
	g.addEdge(7,8);
	 
	g.printGraph();
	System.out.println("Number of edges: " + numEdges(g));
	
    }

    private static int numEdges(Graph g) {
	// TODO Auto-generated method stub
	int sum = 0;
	
	for(int i =0;i<g.vertices;i++)
	{
	    LinkedList<Integer> temp = null;
	    if(g.adjacencyList[i]!=null) {
		temp = g.adjacencyList[i];
		for(int tmp:temp) {
		    sum++;
		}
		
	    }
	}
	return sum/2;
    }

}
