package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingClass {
	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","C:\\MySoftware\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();	//maximize the Browser Window
	//driver.manage().window().fullscreen(); //Full Screen the Browser window
	
	driver.get("https://www.facebook.com/");
	boolean displayStatus = driver.findElement(By.name("email")).isDisplayed();
	System.out.println(displayStatus);	//True
	
	boolean Status = driver.findElement(By.id("email")).isEnabled();
	System.out.println(Status);	//true
	
	driver.findElement(By.id("email")).sendKeys("abcde");
	System.out.println(driver.findElement(By.id("email")).getAttribute("type"));
	Thread.sleep(2000);
	driver.findElement(By.id("email")).clear();
	driver.close();
	}

}
