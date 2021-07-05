package annotations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTestEx {
	@Test(dataProvider = "RegisterData")
	  public void RegisterTest(String name, String mobile, String email, String pass) {  
		  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/register.html");
		  driver.findElement(By.id("name")).sendKeys(name);
		  driver.findElement(By.id("mobile")).sendKeys(mobile);
		  driver.findElement(By.id("email")).sendKeys(email);
		  driver.findElement(By.id("password")).sendKeys(pass);
		  driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		  //Assert.assertEquals(driver.getTitle(), title);  
	  }
	@DataProvider
	public Object[][] RegisterData() {
	    return new Object[][] 
	    {
	      new Object[] { "Mayuri", "8234567891", "mayuri@gmail.com", "543219" },
	      new Object[] { "Kiran", "9850453678", "kiran@gmail.com", "123456" },
	      new Object[] { "Mangesh", "7539872310", "mangesh@gmail.com", "qwerty" },
	      new Object[] { "Mrunali", "9546372810", "mrunali@gmail.com", "jksdhf" },
	    };
	}
	}


