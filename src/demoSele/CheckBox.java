package demoSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws Exception {
		//System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		//Instanstiate a ChromeDriver class
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
		WebElement female = driver.findElement(By.id("Female"));
		boolean femaledisplay = female.isDisplayed(); //To Check it Display or not
		System.out.println("The Value of Female is Display: "+femaledisplay);
		Thread.sleep(2000);
		boolean femaleEnable = female.isEnabled();  // To Check this is Enabled or not 
		System.out.println("The Value of Female is Enabled: "+femaleEnable);
		Thread.sleep(2000);
		female.click();   //To Check it box is selected or not
		if(female.isSelected()) {
			System.out.println("Female is Clicked");
		}else {
			System.out.println("Male is Clicked");
		}
		
		
		
		
	}

}
