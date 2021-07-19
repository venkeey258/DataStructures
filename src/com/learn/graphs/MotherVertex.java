package com.learn.graphs;

import java.util.Arrays;
import java.util.LinkedList;

public class MotherVertex {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Graph g = new Graph(4);
	g.addEdge(0,1);
	g.addEdge(1,3);
	g.addEdge(3,4);
	g.addEdge(3,0);
	g.printGraph();
	System.out.println("Mother Vertex is: " + findMotherVertex(g));
    }

    private static int findMotherVertex(Graph g) {
	// TODO Auto-generated method stub
	 boolean[] visited = new boolean[g.vertices];
	 Arrays.fill(visited, false);
	 
	 int lastV = 0;
	 for (int i = 0; i < g.vertices; i++) {
	     if (visited[i] == false) {
		 DFS(g, i, visited);
		 lastV = i;
	     }
	 }
	 Arrays.fill(visited, false);
	 DFS(g, lastV, visited);
	 
	 for (int i = 0; i < visited.length; i++){
	     if(visited[i] == false){
		 return -1;
	     }
	 }
	 return lastV; 
    }

    private static void DFS(Graph g, int node, boolean[] visited) {
	// TODO Auto-generated method stub
	visited[node] = true;
	LinkedList<Integer> temp = null;
	if(g.adjacencyList[node] != null)
	{
	    temp = g.adjacencyList[node];
	   for(int tmp:temp) {
		if(!visited[tmp]) {
		    visited[tmp]=true;
		    DFS(g,tmp,visited);
		}
	    }
	}
	
    }

}
