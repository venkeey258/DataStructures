package com.learn.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Graph g = new Graph(5);
	g.addEdge(0,1);
	g.addEdge(0,2);
	g.addEdge(1,3);
	g.addEdge(1,4);
	System.out.println("Graph1:");
	g.printGraph();
	System.out.println("DFS traversal of Graph1 : " + bfs(g));
    }

    private static String bfs(Graph g) {
	// TODO Auto-generated method stub
	String result = "";
	boolean[] visited = new boolean[g.vertices];
	for(int i =0;i<g.vertices;i++) {
	    if(!visited[i]) {
		result += bfsVisit(g,i,visited);
	    }
	}
	return result;
    }

    private static String bfsVisit(Graph g, int i, boolean[] visited) {
	// TODO Auto-generated method stub
	String result = "";
	Queue<Integer> queue = new LinkedList<Integer>();
	queue.offer(i);
	while(!queue.isEmpty()) {
	    int curr = queue.poll();
	    result += curr;
	    LinkedList<Integer> temp = g.adjacencyList[curr];
	    for(int tmp:temp) {
		if(!visited[tmp]) {
		    queue.offer(tmp);
		}
	    }
	    visited[curr] = true;
	}
	return result;
    }

}
