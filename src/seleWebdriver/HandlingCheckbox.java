package seleWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","C:\\MySoftware\\chromedriver.exe");
  	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	
	WebElement Checkbox = driver.findElement(By.id("isAgeSelected"));
	
	//Check the Element Displayed Status
	boolean status = Checkbox.isDisplayed();
	System.out.println(status);//true
	
	//Check the Element Enabled Status
		status = Checkbox.isEnabled();
		System.out.println(status);//true
		
	//Check the Element Selected Status
		status = Checkbox.isSelected();
		System.out.println(status);//false
		
	//Select the Checkbox
		Checkbox.click();
	//Check the Element Selected Status
		status = Checkbox.isSelected();
		System.out.println(status);//true


	
	}

}
