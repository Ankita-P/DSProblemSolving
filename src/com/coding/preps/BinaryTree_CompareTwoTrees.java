package com.coding.preps;

public class BinaryTree_CompareTwoTrees {

		public static void main(String args[])
		{		
			
			Node root = new Node(70);
			root.left = new Node(30);
			root.left.left = new Node(10);
			root.left.right = new Node(20);
			root.right = new Node(40);
			root.right.left = new Node(15);
			root.right.right = new Node(25);
			
			Node root1 = new Node(80);
			root1.left = new Node(30);
			root1.left.left = new Node(10);
			root1.left.right = new Node(20);
			root1.right = new Node(40);
			root1.right.left = new Node(15);
			root1.right.right = new Node(25);
			
			traverseTree(root, root1);
			
		}
		
		public static void traverseTree(Node root, Node root1)
		{
			if(root == null && root1 == null)
			{
				return;
			}
			
			traverseTree(root.left, root1.left);
			traverseTree(root.right, root1.right);
			
			
			if(root.Data != root1.Data)
			{
				System.out.print("Not Identical");
				return;
			}		
	}
}


