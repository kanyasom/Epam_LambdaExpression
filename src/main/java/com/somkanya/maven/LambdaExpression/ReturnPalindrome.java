package com.somkanya.maven.LambdaExpression;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturnPalindrome {
	//https://blog.mshimul.com/check-palindrome-using-java-stream-api/
	public static void isPalindrome(String input) {
	    String temp = input.replaceAll("\\s+", "").toLowerCase();
	    Boolean ans=IntStream.range(0, input.length() / 2)
	        .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	    
	    if(ans==true)
	    	System.out.println(input+" is palindrome");
	}    

}
