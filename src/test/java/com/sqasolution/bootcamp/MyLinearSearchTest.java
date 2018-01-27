package com.sqasolution.bootcamp;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sqasolution.bootcamp.MyLinearSearch;

public class MyLinearSearchTest {
	@Test
	public void testlinearSearch1() {
		System.out.println("\nRunning Test -> testMethod1 ");
		int[] arr1 = { 23, 45, 21, 55, 34, 1, 34, 90 };
		MyLinearSearch obj = new MyLinearSearch();
		int result = obj.linearSearch(arr1, 34);
		Assert.assertEquals(result, 4);
	}
	
	@Test
	public void linearSearch2() {
		System.out.println("\nRunning Test -> testMethod1 ");
		int[] arr1 = { 23, 45, 21, 55, 34, 1, 34, 90 };
		MyLinearSearch obj = new MyLinearSearch();
		int result = obj.linearSearch(arr1, 65);
		Assert.assertEquals(result, -1);
	}

}
