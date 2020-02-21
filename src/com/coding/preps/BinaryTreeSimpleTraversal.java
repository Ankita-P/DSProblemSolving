package com.coding.preps;

public class BinaryTreeSimpleTraversal {
	public static void main(String args[])
	{
		
		
		Node root = new Node(70);
		root.left = new Node(30);
		root.left.left = new Node(10);
		root.left.right = new Node(20);
		root.right = new Node(40);
		root.right.left = new Node(15);
		root.right.right = new Node(25);
		
		traverseTree(root);
		
	}
	
	public static void traverseTree(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		traverseTree(root.left);
		traverseTree(root.right);
		
		System.out.print(root.Data + " -> ");
	}

	
}

class Node{
	int Data;
	
	Node left;
	Node right;
	
	public Node(int number)
	{
		this.Data = number;
		this.left = null;
		this.right = null;
	}
}

