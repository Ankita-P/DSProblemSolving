package com.coding.preps;

public class DoubleList_FindTheCenter {

	public static void main(String[] args) {
	
		LinkedList head = new LinkedList(10);
		head = addNode(head, 11);
		head = addNode(head, 12);
		head = addNode(head, 13);
		head = addNode(head, 14);
		
		LinkedList slowPointer = head;
		LinkedList fastPointer = head;
		
		while(fastPointer != null && fastPointer.next != null)
		{
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		
		LinkedList temp = head;
		while(temp != null)
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		
		System.out.println("Center of list is: "+slowPointer.data);
	}
	
	public static LinkedList addNode(LinkedList node, int data)
	{
		if(node == null)
		{
			return new LinkedList(data);
		}
		
		LinkedList head = node;
		
		while(node.next != null)
		{
			node = node.next;
		}
		
		LinkedList temp = new LinkedList(data);
		temp.prev = node;
		node.next = temp;
		
		return head;
	}

}

class LinkedList
{
	int data;
	LinkedList prev;
	LinkedList next;
	LinkedList(int data)
	{
		this.data = data;
		next= prev= null;
	}
}
