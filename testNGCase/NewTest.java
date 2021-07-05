package testNGCase;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
	@Test(dataProvider = "loginData")
	  public void loginTest(String uname, String pass, String title) {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		  driver.findElement(By.id("email")).sendKeys(uname);
		  driver.findElement(By.id("password")).sendKeys(pass);
		  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		  Assert.assertEquals(driver.getTitle(), title);
		  
	  }
	@DataProvider
	public Object[][] loginData() {
	    return new Object[][] 
	    {
	      new Object[] { "kiran@gmail.com", "123456", "JavaByKiran | Dashboard" },
	      new Object[] { "mangesh@gmail.com", "qwerty", "JavaByKiran | Log in" },
	      new Object[] { "neelam@gmail.com", "asdfgh", "JavaByKiran | Log in" },
	    };
	  }
  }
}
