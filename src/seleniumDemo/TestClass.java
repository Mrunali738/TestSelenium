package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.get("https://www.seleniumeasy.com/test/");
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.linkText("Input Forms")).click();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.quit();
	
	}
}
