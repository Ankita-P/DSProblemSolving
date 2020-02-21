package com.coding.preps;

public class String_AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAABBB";
		int deleteCount = 0;
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				deleteCount +=1;
			}
		}
		
		System.out.println(deleteCount);
	}

}
