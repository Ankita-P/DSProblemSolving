package com.coding.preps;

import java.util.HashMap;


class Node1
{
	int Data;
	Node1 left;
	Node1 right;
	
	Node1(int data)
	{
		Data = data;
	}
}

public class BinaryTree_ArrayToTree {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
	
		Node1 root = null;
		Node1 finalTree = createTree(array, root, 0);
		traverseTreeInOrder(finalTree);
	}

	
	public static Node1 createTree(int[] array, Node1 root, int index)
	{
		
		if(index < array.length)
		{
			Node1 temp = new Node1(array[index]);
			root = temp;
			
			root.left = createTree(array, root.left, 2*index+1);
			
			root.right = createTree(array, root.right, 2*index+2);
		}
		
		return root;
	}
	public static void traverseTreeInOrder(Node1 root)
	{
		if(root == null)
		{
			return;
		}
		
		traverseTreeInOrder(root.left);
		System.out.print(root.Data + " -> ");
		traverseTreeInOrder(root.right);
	}
}


