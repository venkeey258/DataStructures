package com.learn.graphs;

import java.util.LinkedList;
import java.util.Stack;

public class IsTree {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Graph g = new Graph(5);
	g.addEdge(0,1);
	g.addEdge(0,2);
	g.addEdge(0,3);
	g.addEdge(3,1);
	g.printGraph();
	System.out.println("isTree : " + isTree(g));
    }

    private static boolean isTree(Graph g) {
	// TODO Auto-generated method stub
	
	if(g.detectCycle(g)) return false;
	if(!hasOneParent(g)) return false;
	if(!connected(g)) return false;
	
	return true;
	
    }

    private static boolean connected(Graph g) {
	// TODO Auto-generated method stub
	int vertices_reached = 0;
	
	boolean[] visited = new boolean[g.vertices];
	 Stack<Integer> stack = new Stack<Integer>();
	 stack.push(0);
	 visited[0] = true;
	 
	 while(!stack.isEmpty()) {
	     int curr = stack.pop();
	     LinkedList<Integer> temp = g.adjacencyList[curr];
	     for(int tmp:temp) {
		 if(!visited[tmp]) {
		     stack.push(tmp);
		     visited[tmp]=true;
		     vertices_reached++;
		 }
	     }
	     
	 }
	 	return (vertices_reached+1) == g.vertices;
    }

    private static boolean hasOneParent(Graph g) {
	// TODO Auto-generated method stub
	boolean[] hasOneParent=new boolean[g.vertices];
	for(int i=0;i<g.vertices;i++) {
	    LinkedList<Integer> temp = g.adjacencyList[i];
	    for(int tmp:temp) {
		if(hasOneParent[tmp]) return false;
		hasOneParent[tmp] = true;
	    }
	}
	for (int i = 0; i < g.vertices; i++) {
	    if (i == 0 && hasOneParent[i] == true) {
		return false;
	    }else if (i != 0 && hasOneParent[i] == false) {
		return false;
	    }
	}
	
	
	return true;
    }

}
