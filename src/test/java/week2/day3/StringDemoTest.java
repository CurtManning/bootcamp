package week2.day3;

import org.testng.Assert;
import org.testng.annotations.Test;
//import week2.day3.appcode.StringDemo;
public class StringDemoTest {
	
	@Test
	public void searchStringTest() {

		String inputString = "Hello Readers";
		String searchString = "Hello";
		System.out.println("\nStringDemoTest -> searchStringTest");
		int searchKey = 0;
		int result = StringDemo.searchString(inputString,searchString);
		Assert.assertEquals(result, searchKey);
	}
	
	@Test
	public void splitStringTest() {

		String inputString = "Welcome:to-java.com-hello:world";
		String[] searchKey = {"Welcome:to","java.com","hello:world"};
		System.out.println("\nStringDemoTest -> splitStringTest");
		String[] result = StringDemo.splitString(inputString);
		Assert.assertEquals(result, searchKey);
	}
}