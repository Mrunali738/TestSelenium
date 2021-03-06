package seleWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLink {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
	System.out.println(gmailLink.isDisplayed());
	System.out.println(gmailLink.isEnabled());
	
	gmailLink.click();
	Thread.sleep(2000);
	driver.close();
	
	}
}
