package seleWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InlineElement {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		
 		driver.get("http://www.google.com/");
 		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
 		Thread.sleep(2000);
 		//driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[3]/a"));
 		Thread.sleep(2000);
 		driver.close();
	}

}
//Rq5Gcb