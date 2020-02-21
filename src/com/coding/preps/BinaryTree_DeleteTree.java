package com.coding.preps;

public class BinaryTree_DeleteTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(70);
		root.left = new Node(30);
		root.left.left = new Node(10);
		root.left.right = new Node(20);
		root.right = new Node(40);
		root.right.left = new Node(15);
		root.right.right = new Node(25);
	
		deleteTree(root);
	}
	
	
	public static void deleteTree(Node root)
	{
		if(root== null)
		{
			return;
		}
		
		deleteTree(root.left);
		deleteTree(root.right);
		
		System.out.println("deleting node ->" + root.Data);
		root = null;
	}

}
