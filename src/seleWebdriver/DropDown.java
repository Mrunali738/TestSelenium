package seleWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	 	 WebDriver driver = new ChromeDriver();	
		 driver.manage().window().maximize();
		 
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	 Select dropdown = new Select (driver.findElement(By.id("select-demo")));
	 dropdown.selectByIndex(3); 
	 dropdown.selectByVisibleText("Friday");
	 Thread.sleep(2000); //System.out.println(dropdown);
	 
	List e = dropdown.getOptions();
	System.out.println(e.size());
	
	driver.close();
	}

}
