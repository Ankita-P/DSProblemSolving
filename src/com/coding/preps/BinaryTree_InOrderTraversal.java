package com.coding.preps;

public class BinaryTree_InOrderTraversal {

		public static void main(String args[])
		{
			
			
			Node root = new Node(70);
			root.left = new Node(30);
			root.left.left = new Node(10);
			root.left.right = new Node(20);
			root.right = new Node(40);
			root.right.left = new Node(15);
			root.right.right = new Node(25);
			
			traverseTreeInOrder(root);
			
			System.out.println();
			
			traverseTreePreOrder(root);
			
			System.out.println();
			
			traverseTreePostOrder(root);
		}
		
		public static void traverseTreeInOrder(Node root)
		{
			if(root == null)
			{
				return;
			}
			
			traverseTreeInOrder(root.left);
			System.out.print(root.Data + " -> ");
			traverseTreeInOrder(root.right);
		}

		public static void traverseTreePreOrder(Node root)
		{
			if(root == null)
			{
				return;
			}
			
			System.out.print(root.Data + " -> ");
			
			traverseTreeInOrder(root.left);
			
			traverseTreeInOrder(root.right);
		}
		
		public static void traverseTreePostOrder(Node root)
		{
			if(root == null)
			{
				return;
			}
			
			
			
			traverseTreeInOrder(root.left);
			
			traverseTreeInOrder(root.right);
			
			System.out.print(root.Data + " -> ");
		}

		
	}
