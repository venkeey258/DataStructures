package com.learn.stacks;

public class PostFix {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String exp = "921*-8-4+";
	Stack<Integer> S = new Stack<Integer>(exp.length());
	for(int i =0;i<exp.length();i++)
	{
	    char ch = exp.charAt(i);
	    if(!Character.isDigit(ch))
	    {
		int x = S.pop();
		int y = S.pop();
		
		switch(ch){
		
		case  '+' : 
		    S.push(y+x);
		    break;
		case  '*':
		    S.push(x*y);
		    break;
		case '-':
		    S.push(y-x);
		    break;
		case '/':
		    S.push(y/x);
		    break;
		}
	    }
	    else
	    {
		S.push(Character.getNumericValue(ch));
	    }
	    
	}
	System.out.println(S.pop());
    }

}
