package testNG;
import org.testng.annotations.Test;

public class TestingExample {

	@Test(priority = 0)
	public void Test_one() {
		System.out.println(11);
		System.out.println(12);
	}

	@Test(priority = 1)
	public void Test_two() {
		System.out.println(13);
		System.out.println(14);
	}
	
	
	
}
