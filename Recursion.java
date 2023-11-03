/*Ronald Noriega

INEW-2338

11/03/2023

 IN THIS PROGRAM I 	WROTE  a boolean method that uses recursion to determine whether a String argument is a palindrome*/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Recursion {
	public static void main(String args[]) {
		 // Input: Get the word, phrase, or sentence from the user
		String str = JOptionPane.showInputDialog("Please enter a word, phrase, or sentence; we will determine if it is a Palindrome:");
		
		String theWord = newStr(str);
		// Check if it's a palindrome
		boolean tester = reverseString(theWord, 0, theWord.length()-1);
		
		if(tester) {
			JOptionPane.showMessageDialog(null, "Your word, phrase, or sentence is a Palindrome.", "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Your word, phrase, or sentence is not a Palindrome.", "Result", JOptionPane.INFORMATION_MESSAGE);
		}
	}public static String newStr(String str) {
		
		str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		
		return str;
}
	
	private static boolean reverseString(String theWord, int start, int end) {
		
		if(start >= end)
		{
			
			return true;
		}
		
		if(theWord.charAt(start)!= theWord.charAt(end)) {
			return false;
		}
		else {
			start++;
			end --;
			return reverseString(theWord,start,end);
		}
	}
}