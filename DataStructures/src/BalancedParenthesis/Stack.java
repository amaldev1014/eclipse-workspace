package BalancedParenthesis;

public class Stack {
 
	int n = 10; 
	int array[] = new int[10];
	int top = -1;
	
	
	public void push(int data) 
	{
		array[++top] = data;
		
	}
	
	public int pop() 
	{
		if(isEmpty()) 
		{
			
			
			return -1;
		}
		else {
		int val = array[top];
		array[top--] = 0;
		return val;
		}
	}
	
	public boolean isEmpty() 
	{
		if(top == -1) 
		{
	 		return true;
		}
		else 
		{
			return false;
		}
	}
	
	public int peek() 
	{
		return array[top];
	}
	
	public int size() 
	{
		return top+1;
	}
	
	public void show() 
	{
		for(int i=0;i<=top;i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
