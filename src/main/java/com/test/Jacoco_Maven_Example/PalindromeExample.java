package com.test.Jacoco_Maven_Example;

public class PalindromeExample {

	public boolean isPalindrome(String inputString) {
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	        char firstChar = inputString.charAt(0);
	        char lastChar = inputString.charAt(inputString.length() - 1);
	        String mid = inputString.substring(1, inputString.length() - 1);
		    for(int i=0; i<=5; i++)
		    {
			    if(i==4)
				    break;
			    System.out.println(" " +i);
		    }
	        return (firstChar == lastChar) && isPalindrome(mid);
	    }
	}
// 	public void add()
// 	{
// 		System.out.println("Adding something");
// 		System.out.println("Adding something new");
// 	}
	
}
