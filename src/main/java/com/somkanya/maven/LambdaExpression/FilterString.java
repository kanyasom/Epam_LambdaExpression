package com.somkanya.maven.LambdaExpression;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
	public static void OnlyStart(List<String> String_List) {
		
		List<String> ans = String_List
				 .stream()
				 .filter(s -> s.startsWith("a") && s.length()==3)
				 .collect(Collectors.toList());
		System.out.println("Method returns: "+ans);
	}

}
