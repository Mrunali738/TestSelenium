package testNGCase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test(priority = 0)
	public void testUserPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		String actTitel = driver.getTitle();
		String expTitel = "JavaByKiran | User";
		Assert.assertEquals(actTitel, expTitel);
	}
	
	@Test(priority = 1)
	public void verifyAddUserPage() throws Exception {
	 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/users.html");
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
	 String actAUPage = driver.getTitle();
	 String expAUPage = "JavaByKiran | Add User";
	 Assert.assertEquals(actAUPage, expAUPage);
	 Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void testUserDeleteButton() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
	Alert alert = driver.switchTo().alert();
	String actMsg = alert.getText();
	String expMsg = "You can not delete Default User";
	Assert.assertEquals(actMsg, expMsg);
	Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	public void verifySubmit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
		//driver.findElement(By.id("username")).sendKeys("Kiran");
		
		Utility1.enterText("Kiran", "id", "username", driver);
		
		driver.findElement(By.id("mobile")).sendKeys("9898989898");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Java/J2EE");
		driver.findElement(By.id("Male")).click();
		Select state = new Select(driver.findElement(By.xpath("//Select")));
		state.selectByVisibleText("Maharashtra");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Alert alert = driver.switchTo().alert();
		String actMsg = alert.getText();
		String expMsg = "User Added Successfully. You can not see added user.";
		Assert.assertEquals(actMsg, expMsg);
		Thread.sleep(5000);
	}
	
	@Test(priority = 4 )
	public void verifyCancelButton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
		driver.findElement(By.id("username")).sendKeys("Mayuri");
		driver.findElement(By.id("mobile")).sendKeys("9545437804");
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Selenium");
		driver.findElement(By.id("Female")).click();
		Select state = new Select(driver.findElement(By.xpath("//Select")));
		state.selectByValue("HP");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/span")).click();
		String actUrl = driver.getCurrentUrl();
		String expUrl = "file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/users.html";
		Assert.assertEquals(actUrl, expUrl);
		Thread.sleep(5000);
	}
	
	@Test(priority = 5)
	public void verifyLogoutButton() {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
        driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).click();
        String actTitle = driver.getTitle();
        String expTitle = "JavaByKiran | Log in";
        Assert.assertEquals(actTitle, expTitle);
	}
	

}
