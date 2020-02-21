package com.coding.preps;

public class BinaryTree_HeightOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(70);
		root.left = new Node(30);
		root.left.left = new Node(10);
		root.left.right = new Node(20);
		root.right = new Node(40);
		root.right.left = new Node(15);
		root.right.right = new Node(25);
		
		System.out.println(getHeight(root));
		
	}
	
	public static int getHeight(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

}

