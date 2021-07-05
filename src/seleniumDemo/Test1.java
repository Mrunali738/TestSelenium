package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		String browserUrl= driver.getCurrentUrl();
		System.out.println(browserUrl);//Google Url

		driver.navigate().to("http://www.msn.com/en-in/?ocid=iehp");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		//Return Window Handle
		System.out.println(driver.getWindowHandle());
		//Return Page Source
		System.out.println(driver.getPageSource());
		
		driver.close();;
		
		
	}

}
