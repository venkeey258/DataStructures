package com.learn.graphs;

import java.util.LinkedList;
import java.util.List;

public class CheckCycle {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	GraphMatrix g1 = new GraphMatrix(4);
/*	g1.addEdge(0,1);
	g1.addEdge(1,2);
	g1.addEdge(1,3);
	g1.addEdge(3,0);
	g1.printGraph(); */
	g1.g[0][1]= 1;
	g1.g[1][2]=1;
	g1.g[1][3]=1;
	g1.g[3][0]=1;
	
	
	g1.printGraph();
	//System.out.println(detectCycle(g1));
	

    }

   

    

}
