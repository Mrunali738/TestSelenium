package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\MySoftware\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.gmail.com/");
	//Return Text Area
String textArea= driver.findElement(By.xpath("//*[@id=\"headingSubtext\"]/span")).getText();
	System.out.println(textArea);
	
driver.findElement(By.cssSelector("#identifierNext > div > button > div.VfPpkd-RLmnJb")).click();

	//Return Error Message
 String Errormessage = driver.findElement(By.xpath("//*[@id='view_container']")).getText();
		System.out.println(Errormessage);	
	
	}

}
