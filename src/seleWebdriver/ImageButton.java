package seleWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageButton {
	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		//Return Google Image name
        String ImageName = driver.findElement(By.id("hplogo")).getAttribute("alt");
		System.out.println(ImageName);
		
		driver.navigate().to("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.findElement(By.id("wp-submit")).click();  //Click Image Button
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.selenium.dev/");
 driver.findElement(By.xpath("//*[@id=\"header\"]/a[1]/img[1]")).click();//Click Image Link
		Thread.sleep(2000);
		driver.close();
	}

}
