package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoAnnotation {
   public static WebDriver driver = null;
	@BeforeSuite
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
	}
	@AfterSuite
	public void tearDown() {
		driver.close();// it will close only current window
		//driver.quit();// it will close all windows/tabs.
	}
	@Test(dataProvider = "loginData")
	  public void loginTest(String uname, String pass, String title) {  
		  driver.findElement(By.id("email")).sendKeys(uname);
		  driver.findElement(By.id("password")).sendKeys(pass);
		  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		  Assert.assertEquals(driver.getTitle(), title);
		  if(driver.getTitle().contains("Dashboard"))
			  driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).click();
			    }
	@AfterMethod
	 public void clickLogout() throws Exception { 	
			  driver.navigate().refresh(); 
			  Thread.sleep(2000);
	  }
	@DataProvider
	public Object[][] loginData() {
	    return new Object[][] 
	    {
	      new Object[] { "kiran@gmail.com", "123456", "JavaByKiran | Dashboard" },
	      new Object[] { "mangesh@gmail.com", "qwerty", "JavaByKiran | Log in" },
	      new Object[] { "neelam@gmail.com", "asdfgh", "JavaByKiran | Log in" },
	    };
	}
}
