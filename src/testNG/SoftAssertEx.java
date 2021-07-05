package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//NOTE::We use it when a test has to continue execution even after an assertion fails in the sequence.

public class SoftAssertEx {
	SoftAssert softassert = new SoftAssert();
	
 @Test
 public void TestCase1() {
	 System.out.println(1);
	 softassert.assertEquals(2, 3);
	 System.out.println(2);
	 softassert.assertEquals(4, 6);
	 System.out.println(3);
	 softassert.assertEquals(5, 5);
	 System.out.println(4);
	 softassert.assertAll();
	}

 @Test
 public void TestCase2() {
	 System.out.println(11);
	 softassert.assertEquals(22, 33);
	 System.out.println(22);
	 softassert.assertEquals(34, 35);
	 System.out.println(33);
	 softassert.assertEquals(25, 25);
	 System.out.println(25);
	 softassert.assertAll();
 }
}
