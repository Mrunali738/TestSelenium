package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestEx {
  @Test(dataProviderClass = DpLogin.class, dataProvider = "loginData")
  public void loginTest(String uname, String pass, String title) {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
      Assert.assertEquals(driver.getTitle(), title);
      
         } 
   }

