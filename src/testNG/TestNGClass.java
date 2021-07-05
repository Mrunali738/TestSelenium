package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

  public class TestNGClass {
    WebDriver driver;
 @Test (priority=1)
 public void launchBrowser() {
 System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 }
 @Test (priority=2)
 public void VerifyGoogleTitle() {
 driver.get("https://www.google.com/");
 Assert.assertEquals("Google",driver.getTitle());
 }
 @Test (priority=3)
 public void CloseBrowser() {
 driver.close();
	}

}
