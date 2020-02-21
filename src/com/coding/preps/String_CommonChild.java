package com.coding.preps;

import java.util.ArrayList;
import java.util.List;

public class String_CommonChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "harry";
		String s2 = "sally";
		
		int count = 0;
		
		char[] visitedLetters = new char[s1.length()];
		List<Character> Letters = new ArrayList<Character>();
		
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s2.length(); j++)
			{
				if(s1.charAt(i) == s2.charAt(j) && !Letters.contains(s1.charAt(i)))
				{
					Letters.add(s1.charAt(i));
					count+=1;
				}
			}
		}
		
		System.out.print(count);
	}

}
