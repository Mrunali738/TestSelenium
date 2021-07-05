package seleWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
 	 WebDriver driver = new ChromeDriver();	
	 driver.manage().window().maximize();
	 
	driver.get("http://demo.guru99.com/test/radio.html");	
	//Check Selected Status
	boolean selectedStatus = driver.findElement(By.id("vfb-7-1")).isSelected();
	System.out.println(selectedStatus);
	driver.findElement(By.id("vfb-7-1")).click();
	selectedStatus = driver.findElement(By.id("vfb-7-1")).isSelected();
	System.out.println(selectedStatus);
	
	//driver.findElement(By.className("radio-inline")).click();
	//driver.findElement(By.id("buttoncheck")).click();
	//Thread.sleep(2000);
	}

}
