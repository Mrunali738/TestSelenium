package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {
	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	 driver.get("https://www.seleniumeasy.com/test/");
	 driver.findElement(By.linkText("Input Forms")).click();
	 driver.findElement(By.partialLinkText("Simple")).click();
	 driver.findElement(By.tagName("input")).sendKeys("Selenium Testing");
	 Thread.sleep(2000);
	 //driver.findElement(By.tagName("input")).clear();
	  driver.findElement(By.cssSelector("#get-input > button")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys("50");
	  driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("20");
	  driver.findElement(By.cssSelector("#gettotal > button")).click();
	  Thread.sleep(2000);
	  driver.close();
	 
	}

}
