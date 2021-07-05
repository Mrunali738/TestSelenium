package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertSce2 {

	@Test
	public void TestCase_1() {
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println(10);
		softAssert1.assertEquals(20,30);
		System.out.println(20);
		softAssert1.assertEquals(30, 40);
		System.out.println(30);
		softAssert1.assertEquals(50, 50);
		softAssert1.assertAll();
	}
	
	@Test
	public void TestCase_2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println(15);
		softAssert2.assertEquals(25,28);
		System.out.println(28);
		softAssert2.assertEquals(30, 32);
		System.out.println(30);
		softAssert2.assertEquals(35, 35);
		softAssert2.assertAll();	
	}
	
	@Test
	public void TestCase_3() {
		SoftAssert softAssert3 = new SoftAssert(); 
        System.out.println(11);
        softAssert3.assertEquals(34, 34);
	}
	
	
}
