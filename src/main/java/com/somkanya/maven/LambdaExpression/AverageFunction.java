package com.somkanya.maven.LambdaExpression;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Hello world!
 *
 */
public class AverageFunction
{
	public static void Average(List<Integer> list)
	{
		IntSummaryStatistics stats=list.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
    	
    	System.out.println("The average is :" + stats);
	}
}
