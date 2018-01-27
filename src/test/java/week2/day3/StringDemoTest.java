package week2.day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringDemoTest {
	
	@Test
	public void searchStringTest() {

		String inputString = "Hello Readers";
		String searchString = "Hello";
		System.out.println("StringDemoTest -> searchStringTest");
		int searchKey = 0;
		int result = StringDemo.searchString(inputString,searchString);
		Assert.assertEquals(result, searchKey);
	}
	
	@Test
	public void splitStringTest() {

		String inputString = "Welcome:to-java.com-hello:world";
		String[] searchKey = {"Welcome:to","java.com","hello:world"};
		System.out.println("StringDemoTest -> splitStringTest");
		String[] result = StringDemo.splitString(inputString);
		Assert.assertEquals(result, searchKey);
	}
	
	@Test
	public void countDigitsBeforeAndAfterDecimalTest() {

		double inputString = 143.32;
		String searchKey = "Number of digits before decimal is 3 and after decimal is 2";
		System.out.println("StringDemoTest -> countDigitsBeforeAndAfterDecimal");
		String result = StringDemo.countDigitsBeforeAndAfterDecimal(inputString);
		Assert.assertEquals(result, searchKey);
	}
}