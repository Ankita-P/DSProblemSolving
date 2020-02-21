package com.coding.preps;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "aaaaabdaaaaa";
		
		int i =0;
		int j = test.length()-1;
		
		while(i < test.length()-1 && j>=0)
		{
			if(test.charAt(i) == test.charAt(j))
			{
						
				i++;
				j--;
			
			}
			else
			{
				System.out.println(false);
				System.exit(0);
			}
		}
		
		System.out.println(true);
	}

}
