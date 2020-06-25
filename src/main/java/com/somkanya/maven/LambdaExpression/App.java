package com.somkanya.maven.LambdaExpression;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> list = Arrays.asList(2, 7, 10, 11, 25, 187, 190, 230, 219);
    	System.out.println("Run AverageFunction class for average of list of integers");
    	AverageFunction ob=new AverageFunction();
    	ob.Average(list);
    	
    	System.out.println("Return a list of all strings that start with the "
    			+ "letter 'a' (lower case) and have exactly 3 letters.");
    	List<String> String_List = Arrays.asList("hello","app","world","aaa","aka","earth","mom");
    	FilterString ob1 = new FilterString();
    	ob1.OnlyStart(String_List);
    	
    	System.out.println("Return a list of all the palindrome strings");
    	ReturnPalindrome ob2 = new ReturnPalindrome();
    	for(int i=0;i<String_List.size();i++)
    	{
    		ob2.isPalindrome(String_List.get(i));
    	}
    	
    	
    }
}
