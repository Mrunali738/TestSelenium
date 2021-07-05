package testNGCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {  
	
	@Test(priority = 0)
	public void verifyHeading() throws IOException {
		WebDriver driver = Utility.browserSetup("chrome");
		//System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
		String heading = driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		Assert.assertEquals(heading, "Sign in to start your session");	
	}
	
	@Test(priority = 1)
	public void checkTitle() throws IOException {
		WebDriver driver = Utility.browserSetup("chrome");
		String actTitle = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		String expTitle = "Java By Kiran";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test(priority = 2)
	public void checkCourseName() throws IOException {
		WebDriver driver = Utility.browserSetup("chrome");
		String actCourse = driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
		String expCourse = "JAVA | SELENIUM | PYTHON";
		Assert.assertEquals(actCourse, expCourse);
	}
	
	@Test(priority = 3)
	public void checkBlankUname() throws IOException{
		WebDriver driver = Utility.browserSetup("chrome");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actErrMsg = driver.findElement(By.id("email_error")).getText(); 
		String expErrMsg = "Please enter email"; 
		Assert.assertEquals(actErrMsg, expErrMsg);	 
	}
	
	@Test(priority = 4)
	public void checkBlankUpw() throws IOException {
		WebDriver driver = Utility.browserSetup("chrome");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actErrMsg = driver.findElement(By.id("password_error")).getText(); 
		String expErrMsg = "Please enter password."; 
		Assert.assertEquals(actErrMsg, expErrMsg);	 		
	}

	@Test(priority = 5)
	public void verifyInCorrectUname() throws IOException {
		WebDriver driver = Utility.browserSetup("chrome");
		driver.findElement(By.id("email")).sendKeys("Kiran@.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actErrMsg = driver.findElement(By.id("email_error")).getText(); 
		String expErrMsg = "Please enter email as kiran@gmail.com"; 
		Assert.assertEquals(actErrMsg, expErrMsg);	 		
	}
	
	@Test(priority = 6)
	public void verifyIncorrectUpw() throws IOException {
		WebDriver driver = Utility.browserSetup("chrome");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actErrMsg = driver.findElement(By.id("password_error")).getText(); 
		String expErrMsg = "Please enter password 123456"; 
		Assert.assertEquals(actErrMsg, expErrMsg);	 			
	}
	
	@Test(priority = 7)
	public void verifySignIn() throws IOException {
		WebDriver driver = Utility.browserSetup("chrome");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	    String actDbPage = driver.getTitle();
	    String expDbPage = "JavaByKiran | Dashboard";
	    Assert.assertEquals(actDbPage, expDbPage);
	}
	
}
