package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
	public static void main(String[] args) {
		
/* Instantiate Mozila Firefox Browser Driver
 * System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.27.0-win32\\geckodriver.exe"); 
 * Create Mozilla Firefox
 * Browser Driver WebDriver driver = new FirefoxDriver();  */
	//Instantiate Chrome Browser Driver
	System.setProperty("webdriver.chrome.driver","C:\\MySoftware\\chromedriver.exe");
	
	//Create Chrome Browser Driver
	WebDriver driver = new ChromeDriver();
	driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
	driver.findElement(By.name("pwd")).sendKeys("opensourcecms");
	driver.findElement(By.className("button")).click();
	
	String url = driver.getCurrentUrl();
	if(url.contains("https://s1.demo.opensourcecms.com/wordpress/wp-admin/")) {
		System.out.println("Login is Successfullly");
	}
	else {
		System.out.println("Login is Unsuccessfully");
	}
	
	}

}
