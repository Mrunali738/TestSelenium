package demoSele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	public static void main(String[] args) throws Exception {
			
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
		 * driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 * driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		 * String Heading = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		 * System.out.println(Heading);
		 * String Title =driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
		 * System.out.println(Title);
		 * driver.close(); */
		driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/register.html");
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Mayuri Bandebuche");
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9545437804");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mayuribandebuche321@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("54321");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();   // To Print Alert Message
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		driver.close();
		
		
	}

}
