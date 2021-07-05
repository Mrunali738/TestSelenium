package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpClass {
	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//Handle Popup Window
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	Alert popup = driver.switchTo().alert(); //focus from the web page to popup window
	String ErrMessage = popup.getText(); //Captures the error message from the window popup	
	System.out.println(ErrMessage);
	Thread.sleep(2000);
	popup.accept();
	driver.findElement(By.name("login")).sendKeys("India123");
	Thread.sleep(2000);
	driver.quit();
	}

}
