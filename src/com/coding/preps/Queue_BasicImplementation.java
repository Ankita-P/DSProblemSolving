package com.coding.preps;

import java.util.Arrays;

public class Queue_BasicImplementation {
	String[] array;
	private int queueSize;
	private int front, rear, numberOfElements = 0;
	
	public Queue_BasicImplementation(int size) {
		queueSize = size;
		array = new String[queueSize];
		
		Arrays.fill(array, "-1");
	}
	
	public void insert(String value)
	{
		if(numberOfElements + 1 < array.length)
		{
			array[rear] = value;
			rear++;
			numberOfElements++;
		}
		else
		{
			System.out.println("Note: Queue is full.");
		}
	}
	
	public void remove()
	{
		if(numberOfElements > 0)
		{
			System.out.println("Removing item "+array[front]);
			array[front] = "-1";
			front++;
			numberOfElements--;
		}
		else
		{
			System.out.println("Note: Queue is empty.");
		}
	}
	
	public void peek()
	{
		System.out.println("Peek: "+array[front]+" is at start of queue");
	}
	
	public void displayQueue()
	{
		for(int i = 0; i< array.length; i++)
		{
			if(array[i] != "-1")
				System.out.println(array[i]);
		}
	}
	
	public void priorityInsert(String value)
	{
		if(numberOfElements == 0)
		{
			insert(value);
		}
		else
		{
			int i;
			for( i= numberOfElements-1; i >= 0; i--)
			{
				if(Integer.parseInt(value)>Integer.parseInt(array[i]))
				{
					array[i+1] = array[i];
				}
				else
				{
					break;
				}
			}
			array[i+1] = value;
			rear++;
			numberOfElements++;
			
			
		}
	}
	
	public static void main(String args[])
	{
		Queue_BasicImplementation queue = new Queue_BasicImplementation(10);
		
		queue.priorityInsert("8");
		queue.priorityInsert("2");
		queue.priorityInsert("5");
		queue.priorityInsert("1");
		queue.priorityInsert("3");
	
		
		queue.displayQueue();
		
		queue.remove();
		queue.remove();
		
		queue.displayQueue();
		
		queue.peek();
		
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		
		
		
		
	}
}
