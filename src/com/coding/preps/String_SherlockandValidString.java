package com.coding.preps;

import java.util.Arrays;

public class String_SherlockandValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbccrrddeeeff";
		int[] charArray = new int[26];
		String output = "NO";
		
		for(int i=0;i<s.length(); i++)
		{
			charArray[s.charAt(i)-'a']++;
		}
		
		Arrays.sort(charArray);
		
		int minFrequency = 0;
		int index =0;
		while(index < charArray.length)
		{
			if(charArray[index] != 0)
			{
				minFrequency = charArray[index];
				break;
			}
			index++;
		}
		int maxFrequency = charArray[25];
		
		if(minFrequency == maxFrequency)
		{
			output = "YES";
		}
		if((maxFrequency - minFrequency == 1 && charArray[24] < maxFrequency) || (minFrequency == 1 && charArray[index+1] == maxFrequency))
		{
			output = "YES";
		}
		System.out.println(output);
	}

}
