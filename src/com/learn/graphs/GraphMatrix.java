package com.learn.graphs;

public class GraphMatrix {
    
    int vertices;
    int[][] g ;
    
    public GraphMatrix(int vertices) {
	this.vertices = vertices;
	g = new int[vertices][vertices];
	for(int i =0;i<vertices;i++) {
	    for(int j=0;j<vertices;j++) {
		this.g[i][j]=0;
	    }
	}
	
    }
    
    public void printGraph() {
	for(int i =0;i<vertices;i++)
	{
	    for(int j=0;j<vertices;j++)
	    {
		System.out.print(g[i][j]+"\t");
	    }
	    System.out.println();
	}
    }

}
