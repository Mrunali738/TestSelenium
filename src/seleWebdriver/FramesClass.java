package seleWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesClass {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
  	WebDriver driver = new ChromeDriver();
  	driver.manage().window().maximize();
  	
  	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
    //Switch to 3rd Frame from Top Window using index
  	driver.switchTo().frame("classFrame");
  	//Access/Operate an Element
  	driver.findElement(By.linkText("org.openqa.selenium")).click();
  	Thread.sleep(2000);
    //Back to Top Window (default)
  	driver.switchTo().defaultContent();
  	
  	driver.switchTo().frame("packageFrame");
  	driver.findElement(By.cssSelector("body > div > ul > li:nth-child(1) > a")).click();
  	Thread.sleep(2000);
  	driver.switchTo().defaultContent();
  	
  	driver.switchTo().frame("packageListFrame");
  	driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
  	Thread.sleep(2000);
  	driver.close();
	}

}
