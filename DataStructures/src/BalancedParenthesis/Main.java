package BalancedParenthesis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check());
	

	}
	
	public static boolean check() 
	{
		
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Expression to be Checked: ");
		String str = scan.next();
	    int len = str.length();
	    for(int i=0;i<len;i++) 
	    {
	    	if(str.charAt(i)=='(') 
	    	{
	    		stack.push(1);
	    	}
	    	if(str.charAt(i) ==(')')) 
	    	{
	    		int t = stack.pop();
	    		if(t == -1) 
	    		{
	    			return false;
	    		}
	    	}
	    }
	    if(stack.isEmpty()) 
	    {
	    	return true;
	    }
	    else 
	    {
	    	return false;
	    	
	    }
	}

}
