package com.learn.graphs;

import java.util.LinkedList;

public class Graph{

    int vertices; //Total number of vertices in graph

   LinkedList<Integer> adjacencyList[]; //An array of linked lists to store adjacent vertices.
   public Graph(int vertices) {

        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }

    }

    public void addEdge(int source, int destination){

        if (source < vertices && destination < vertices){
            this.adjacencyList[source].addLast(destination);
         //for undirected graph uncomment the line below
            //this.adjacencyList[destination].insertAtEnd(source);
        }
 }

    public void printGraph()

    {
	System.out.println(">>Adjacency List of Directed Graph<<");
	for (int i = 0; i < vertices; i++)
        {
              if(adjacencyList[i]!=null){

                System.out.print("|" + i + "| => ");
                LinkedList<Integer> temp = adjacencyList[i];
                for(int cnt=0;cnt<temp.size();cnt++)
                {
                    System.out.print("[" + temp.get(cnt) + "] -> ");
                   
                }
                System.out.println("null");
              }
              else{
        	  System.out.println("|" + i + "| => "+ "null");
              }
        }

    }

    public  boolean detectCycle(Graph g1) {
	// TODO Auto-generated method stub
	int num_of_vertices = g1.vertices;
	
	boolean[] visited = new boolean[num_of_vertices];
	boolean[] stackFlag = new boolean[num_of_vertices];
	
	 for (int i = 0; i < num_of_vertices; i++){
	     if (cyclic(g1, i, visited, stackFlag)){
		 return true;
	     }
	 }
	 return false;
    }

    public boolean cyclic(Graph g1, int v, boolean[] visited, boolean[] stackFlag) {
	// TODO Auto-generated method stub
	
	 if (stackFlag[v]) return true;
	 if (visited[v]) return false;
	 
	 visited[v] = true;
	 stackFlag[v] = true;
	
	 LinkedList<Integer> temp = adjacencyList[v]; 
	 for(int tmp:temp) {
	     if(cyclic(g1, tmp, visited, stackFlag)){
		 return true;
	     }
	 }
	 stackFlag[v] = false;
	 return false;
	 
    }
}
