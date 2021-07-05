package demoSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableFor {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	//Instantiate a ChromeDriver class
	WebDriver driver = new ChromeDriver();
	driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
	//Here writing a logic to dynamically count rows
    for(int i=2; i<=5; i++) {
	  for(int j=2; j<=7; j++) {
		String label = driver.findElement(By.xpath(
		"/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(label);
		
	  }
    }
	//Note >> This Logic is used when we want to all data of rows and column from webtable	
	
	}

}
