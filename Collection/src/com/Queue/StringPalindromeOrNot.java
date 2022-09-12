package com.Queue;

import java.util.Stack;

public class StringPalindromeOrNot {
	public void checkString(String str)
	{
		Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }

        String revString = "";

        while (!stack.isEmpty()) {
            revString = revString+stack.pop();
        }

        if (str.equals(revString))
            System.out.println("palindrome.");
        else
            System.out.println("not a palindrome.");

	}

	public static void main(String[] args) {
        String str = "madam";
        System.out.println("String is : ");
        StringPalindromeOrNot obj = new StringPalindromeOrNot();
        obj.checkString(str);
        
        

	}

}
