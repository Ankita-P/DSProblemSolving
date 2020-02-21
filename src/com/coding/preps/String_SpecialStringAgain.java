package com.coding.preps;

public class String_SpecialStringAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbaba";
		long counter = 0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			// if the current symbol is in the middle of palindrome, e.g. aba
			int offset = 1;
			while (i - offset >= 0 && i + offset < length && s.charAt(i - offset) == s.charAt(i - 1)
					&& s.charAt(i + offset) == s.charAt(i - 1)) {
				counter++;
				offset++;
			}
			// if this is repeatable characters aa
			int repeats = 0;
			while (i + 1 < length && s.charAt(i) == s.charAt(i + 1)) {
				repeats++;
				i++;
			}
			counter += repeats * (repeats + 1) / 2;
		}
		
		System.out.println(counter+length);
	}

}
