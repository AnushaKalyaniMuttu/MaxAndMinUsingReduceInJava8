package com.demo;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinUsingReduceInJava8 {

	public static void main (String [] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,1,2,3);	

		System.out.println(list.stream().reduce((x,y)->x<y?x:y).get());
		System.out.println(list.stream().reduce((x,y)->x>y?x:y).get());

	}
}
