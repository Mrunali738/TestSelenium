package testNG;
import org.testng.annotations.Test;

public class TestingExample1 {
	
	@Test(priority = 0)
	public void Test_three() {
		System.out.println(15);
		System.out.println(16);
	}
	
	@Test(priority = 1)
	public void Test_four() {
		System.out.println(17);
		System.out.println(18);
	}
}