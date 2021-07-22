package com.learn.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Graph g=new Graph(5);
	g.addEdge(0,1);
	g.addEdge(0,2);
	g.addEdge(1,3); 
	g.addEdge(3,4); 
	g.addEdge(1,4);
	System.out.println(findMin(g, 0, 4));
    }

    private static int findMin(Graph g, int source, int dest) {
	// TODO Auto-generated method stub
	boolean[] visited = new boolean[g.vertices];
	int[] distance = new int[g.vertices];
	
	Queue<Integer> queue = new LinkedList<Integer>();
	queue.offer(source);
	visited[source]=true;
	while(!queue.isEmpty()) {
	    int curr = queue.poll();
	    LinkedList<Integer> temp = g.adjacencyList[curr];
	    for(int tmp:temp) {
		if(!visited[tmp]) {
		    queue.offer(tmp);
		    visited[tmp]=true;
		    distance[tmp]=distance[curr]+1;
		    
		    if(tmp == dest) return distance[dest];
		}
		
	    }
	    
	}
	
	return -1;
    }

}
