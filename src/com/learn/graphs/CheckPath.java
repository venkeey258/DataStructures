package com.learn.graphs;

import java.util.LinkedList;
import java.util.Stack;

public class CheckPath {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Graph g1 = new Graph(9);
	g1.addEdge(0,2);
	g1.addEdge(0,5);
	g1.addEdge(2,3);
	g1.addEdge(2,4);
	g1.addEdge(5,3);
	g1.addEdge(5,6);
	g1.addEdge(3,6);
	g1.addEdge(6,7);
	g1.addEdge(6,8);
	g1.addEdge(6,4);
	g1.addEdge(7,8);
	g1.printGraph();
	//System.out.println("Path exists: " + checkPath(g1, 0, 7));
	System.out.println();
	Graph g2 = new Graph(4);
	g2.addEdge(0,1);
	g2.addEdge(1,2);
	g2.addEdge(1,3);
	g2.addEdge(2,3);
	g2.printGraph();

        System.out.println("Path exists: " + checkPath(g2, 3, 0));
    }

    private static boolean checkPath(Graph g, int source, int dest) {
	// TODO Auto-generated method stub
	boolean result = false;
	boolean[] visited = new boolean[g.vertices];
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(source);
	visited[source]=true;
	
	while(!stack.isEmpty()) {
	    int curr = stack.pop();
	    LinkedList<Integer> temp = g.adjacencyList[curr];
	    for(int tmp:temp) {
		if(!visited[tmp]) {
		    if(tmp==dest) return true;
		    stack.push(tmp);
		    visited[tmp]=true;
		}
	    }
	}
	return result;
    }

   

}
