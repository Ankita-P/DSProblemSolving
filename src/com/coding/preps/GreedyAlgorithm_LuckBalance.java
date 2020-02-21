package com.coding.preps;

public class GreedyAlgorithm_LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1 = "fghi";
			String s2 = "fghi";
			
			int index =0;
			while(index<s1.length())
			{
				index+=1;
				char letter1 = s1.charAt(index);
				char letter2 = s2.charAt(index);
				
				if(letter1>letter2)
					System.out.println("true");
				else if(letter2>letter1)
					System.out.println("false");
				
							
			}
			System.out.println("true1");
	}

}
