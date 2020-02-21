package com.coding.preps;

import java.util.Arrays;

public class Stack_BasicImplementation {

	int stackSize;
	int topOfStack = -1;
	String[] arrayElements;
	
	Stack_BasicImplementation(int size)
	{
		stackSize = size;
		arrayElements = new String[stackSize];
		
		Arrays.fill(arrayElements, "-1");
	}
	
	public void push(String value)
	{
		if(topOfStack + 1 < arrayElements.length)
		{
			topOfStack++;
			arrayElements[topOfStack] = value;
		}
		else
		{
			System.out.println("Note: Stack is full.");
		}
		
	}
	
	public void pop()
	{
		if(topOfStack>= 0)
		{
			System.out.println("Popped item "+arrayElements[topOfStack]);
			arrayElements[topOfStack--] = "-1";
			
			
		}
		else
		{
			System.out.println("Note: Stack is empty.");
		}
		
	}
	
	public void displayStack()
	{
		for(int i = arrayElements.length-1; i>=0; i--)
		{
			if(arrayElements[i] != "-1")
			{
				System.out.println(i +"->" + arrayElements[i]);	
			}
		}
	}
	
	public void peek()
	{
		System.out.println("Peek: "+arrayElements[topOfStack]+" is on the top of stack.");
	}
	
	public static void main(String[] args) {
		Stack_BasicImplementation stack = new Stack_BasicImplementation(10);
		
		stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("8");
		
		stack.displayStack();
		
		stack.pop();
		stack.peek();
		stack.pop();
		
		stack.displayStack();
		stack.pop();
		stack.pop();
		stack.pop();
	}

}

