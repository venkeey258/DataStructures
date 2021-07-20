package com.learn.graphs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Graph g = new Graph(5);
	g.addEdge(0,1);
	g.addEdge(0,2);
	g.addEdge(1,3);
	g.addEdge(1,4);
	System.out.println("Graph1:");
	g.printGraph();
	System.out.println("DFS traversal of Graph1 : " + dfs(g));
    }

    private static String dfs(Graph g) {
	// TODO Auto-generated method stub
	String result = "";
	boolean[] visited = new boolean[g.vertices];
	for(int i =0;i<g.vertices;i++) {
	    if(!visited[i]) {
		result = result+dfsVisit(g,i,visited);
	    }
	}
	return result;
    }

    private static String dfsVisit(Graph g, int source, boolean[] visited) {
	// TODO Auto-generated method stub
	Stack<Integer> stack = new Stack<Integer>();
	String result ="";
	stack.push(source);
	while(!stack.isEmpty()) {
	    int curr = stack.pop();
	    result += curr;
	    LinkedList<Integer> temp = g.adjacencyList[curr];
	    for(int tmp:temp)
	    {
		if(!visited[tmp]) {
		    stack.push(tmp);
		}
	    }
	    visited[curr]=true;
	}
	
	return result;
    }

}
