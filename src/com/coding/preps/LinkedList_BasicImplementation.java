package com.coding.preps;

public class LinkedList_BasicImplementation {

	
	
	public static void main(String[] args) {

		ListNode head = new ListNode(4);
		ListNode nodeB = new ListNode(2);
		ListNode nodeC = new ListNode(3);
		ListNode nodeD = new ListNode(10);
		ListNode nodeE = new ListNode(2);
		ListNode nodeF = new ListNode(5);
		
		head.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		nodeE.next = nodeF;
		
		countNodes(head);
	}

	private static void countNodes(ListNode node) {
		int counter =1;
		ListNode current = node;
		while(current.next != null)
		{
			counter+=1;
			System.out.print(current.data);
			current = current.next;
		}
		System.out.println("total nodes "+ counter);
	}

}

class ListNode
{
	int data;
		
	ListNode next;
		
	ListNode(int value)
	{
		data = value;
		next = null;
	}
}