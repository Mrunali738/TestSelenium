package testNGCase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	  @Test(priority = 0) 
	  public void RegisterPage() {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/logout.html" );
	  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	  String actHeading = driver.getTitle(); 
	  String expHeading = "JavaByKiran | Registration Page";
	  Assert.assertEquals(actHeading, expHeading); }
	  
	  @Test(priority = 1)
	  public void CheckRegisterBlankUserName() {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/logout.html" ); 
	  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	  driver.findElement(By.id("name")).sendKeys("");
	  driver.findElement(By.id("mobile")).sendKeys("9545437804");
	  driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
	  String acterrName = driver.findElement(By.id("name_error")).getText(); 
	  String experrName = "Please enter Name.";
	  Assert.assertEquals(acterrName, experrName);
	  }
	  
	  @Test(priority = 2)
	  public void CheckRegisterBlankMobileNo() {
	  System.setProperty("webdriver.chrome.driver","C:\\MySoftware\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/logout.html");
	  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	  driver.findElement(By.id("name")).sendKeys("Mayuri");
	  driver.findElement(By.name("mobile")).sendKeys("");
	  driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
	  String acterrMb = driver.findElement(By.id("mobile_error")).getText();
	  String experrMb = "Please enter Mobile."; 
	  Assert.assertEquals(acterrMb, experrMb);
	  
	  }
	  
	  @Test(priority = 3) 
	  public void CheckRegisterBlankEmailid() {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/logout.html"); 
	  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	  driver.findElement(By.id("name")).sendKeys("Mayuri");
	  driver.findElement(By.id("mobile")).sendKeys("9545437804");
	  driver.findElement(By.id("password")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
	  String acterrEmail = driver.findElement(By.id("email_error")).getText();
	  String experrEmail = "Please enter Email."; 
	  Assert.assertEquals(acterrEmail, experrEmail); }
	 
	@Test(priority = 4)
	public void CheckRegisterBlankPassword() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/logout.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		driver.findElement(By.id("name")).sendKeys("Mayuri");
		driver.findElement(By.id("mobile")).sendKeys("9545437804");
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
	    String acterrPW = driver.findElement(By.id("password_error")).getText();
		String experrPW = "Please enter Password.";
		Assert.assertEquals(acterrPW, experrPW);
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public void VerifyRegisterSignIn() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/logout.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		driver.findElement(By.id("name")).sendKeys("Mayuri");
		driver.findElement(By.id("mobile")).sendKeys("9545437804");
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		Alert alert = driver.switchTo().alert();
		String actText = alert.getText();
		String expText = "User registered successfully.";
		Assert.assertEquals(actText, expText);
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void verifyAlreadyAccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/register.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		String actUrl = driver.getCurrentUrl();
		String expUrl = "file:///C:/MySoftware/Offline%20Website/Offline%20Website/index.html";
		Assert.assertEquals(actUrl, expUrl);
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void verifyTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/register.html");
		//String actHeading = driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		
		String actHeading = Utility2.getLabel("xpath", "/html/body/div/div[2]/p", driver);
		String expHeading = "Register a new membership";
		Assert.assertEquals(actHeading, expHeading);	
	}
}
