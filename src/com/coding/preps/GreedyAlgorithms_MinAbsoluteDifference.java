package com.coding.preps;

import java.util.Arrays;

public class GreedyAlgorithms_MinAbsoluteDifference {

	public static void main(String[] args) {
		int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
		Arrays.sort(arr);
		int minValue =Math.abs(arr[0] - arr[1]);

		for(int i=0; i<arr.length-1; i++)
		{
			
				int value = Math.abs(arr[i]-arr[i+1]);
				if(value<minValue)
				{
					minValue = value;
				}
		}
		
		System.out.println(minValue);
	}

}
