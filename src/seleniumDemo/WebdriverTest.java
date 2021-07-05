package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverTest {

	public static void main(String[] args) {
		//Instantiate Mozila Firefox Browser Driver
System.setProperty("webdriver.gecko.driver","C:\\MySoftware\\chromedriver.exe");
	//Create Mozilla Firefox Browser Driver
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
	driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
	driver.findElement(By.name("wp-submit")).click();
	
	String url = driver.getCurrentUrl();
	if(url.contains("https://s1.demo.opensourcecms.com/wordpress/wp-admin/")) {
		System.out.println("Login is Successfullly");
	}
	else {
		System.out.println("Login is Unsuccessfully");
	}
	
	}

}
