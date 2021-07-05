package seleWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("//*[@id=\"tr_4\"]/td[8]");
		WebElement rows = driver.findElement(By.tagName("tr"));
		Thread.sleep(2000);
		Dimension rowscount = rows.getSize();
		System.out.println(rowscount);
	}

}
