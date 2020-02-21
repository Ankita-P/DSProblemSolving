package com.coding.preps;

public class DoubleLinkedList_BasicImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleList head = new DoubleList(10);

		head = insertNode(head, 11);
		head = insertNode(head, 12);
		head = insertNode(head, 13);
		head = insertNode(head, 14);
		
		DisplayNodes(head);
	}
	
	public static DoubleList insertNode(DoubleList node, int data)
	{
		if(node == null)
		{
			return new DoubleList(data);
		}
		
			
			DoubleList temp = node;
			while(node.next != null) {
				node = node.next;
			}
			DoubleList temp1 = new DoubleList(data);
			node.next = temp1;
			temp1.previous = node;
	
		return temp;
	}
	
	public static void DisplayNodes(DoubleList head)
	{
		DoubleList node = head;
		while(node.next != null)
		{
			System.out.print(node.data +" ");
			node = node.next;
		}
	}

}

class DoubleList
{
	int data;
	DoubleList previous;
	DoubleList next;
	
	DoubleList(int data)
	{
		this.data = data;
		previous = null;
		next = null;
	}
}
