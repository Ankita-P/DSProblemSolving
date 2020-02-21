package com.coding.preps;

import java.util.Collection;
import java.util.HashMap;

public class String_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = "fcrxzwscanmligyxyvym";
			String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
			
			int deleteCount =0;
			HashMap<Character, Integer> string1 = new HashMap<Character, Integer>();
			HashMap<Character, Integer> string2 = new HashMap<Character, Integer>();
			
			for(int i=0; i< a.length(); i++)
			{
				if(string1.containsKey(a.charAt(i)))
				{
					int count = string1.get(a.charAt(i));
					string1.replace(a.charAt(i), count+1);
				}
				else
				{
					string1.put(a.charAt(i), 1);	
				}
				
			}
			
			for(int i=0; i< b.length(); i++)
			{
				if(string2.containsKey(b.charAt(i)))
				{
					int count = string2.get(b.charAt(i));
					string2.replace(b.charAt(i), count+1);
				}
				else
				{
					string2.put(b.charAt(i), 1);	
				}
				
			}
			
			for(char c : string1.keySet())
			{
				if(string2.containsKey(c))
				{
					if(string1.get(c) > string2.get(c))
					{
						string1.replace(c, string1.get(c) - string2.get(c));
						string2.replace(c, 0);
					}
					else if(string2.get(c) > string1.get(c))
					{
						string2.replace(c, string2.get(c) - string1.get(c));
						string1.replace(c, 0);
					}
					else
					{
						string1.replace(c, 0);
						string2.replace(c, 0);
					}
					
				}
				
					
			}
			
			for(int value : string1.values())
			{
				deleteCount +=value;
			}
			
			for(int value : string2.values())
			{
				deleteCount +=value;
			}
			
			System.out.println(deleteCount);
	}

}
