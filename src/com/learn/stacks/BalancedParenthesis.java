package com.learn.stacks;

public class BalancedParenthesis {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String exp = "{[({}))]}";
	Stack<Character> S = new Stack<Character>(exp.length());
        for(int i =0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            
            switch(ch) {
            
            case '{' : S.push(ch);break;
            case '}': S.pop();break;
            case '[' : S.push(ch);break;
            case ']': S.pop();break;
            case '(' : S.push(ch);break;
            case ')': S.pop();break;
            
            }
        }
        if(S.isEmpty()) System.out.println("true");
        else System.out.println("false");

    }

}
