package seleWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
    //Switch to 3rd Frame from Top Window using index
    driver.switchTo().frame(2);
    driver.findElement(By.linkText("org.openqa.selenium")).click();
    Thread.sleep(2000);
    
   //Back to Top Window (default)
  	driver.switchTo().defaultContent();

  	//Switch from Top Window to Second Frame
  	driver.switchTo().frame(1);
  	driver.findElement(By.cssSelector("body > div > ul > li:nth-child(1) > a")).click();
  	Thread.sleep(2000);
  	driver.switchTo().defaultContent();
  	
  	//Switch from Top Window to First Frame
  	driver.switchTo().frame(0);
  	driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]/a")).click();
  	Thread.sleep(3000);
  	driver.close();
    
 
	}

}
