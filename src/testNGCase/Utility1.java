package testNGCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility1 {

	/* Note >> Here we used Static in method because we need to repeat call this method So, 
	* there is no need of making object in every step and our code is make easy*/
	 static public void openurl(String url, WebDriver driver) {
		 driver.get(url);
	 }
	/** (**means Documents comment and * means Multiple line Comments)
	 * This method is used for entering text into any text boxes.
	 * @param dataToEnter - whatever data u want to enter
	 * @param locName - like xpath.id
	 * @param locvalue - like email means xpath("/html/body") in this /html/body this will be passed
	 * @param driver - initialized driver object reads to be sent
	 */
	static public void enterText(String dataToEnter, String locName, String locvalue, WebDriver driver) {
		if(locName.equals("id")) {
			driver.findElement(By.id(locvalue)).sendKeys(dataToEnter);
		}
		if(locName.equals("xpath")) {
			driver.findElement(By.xpath(locvalue)).sendKeys(dataToEnter);
		}
		}
		/*
		 * public static void main(String[] args) { WebDriver driver = new
		 * ChromeDriver(); openurl("http:\\www.javabykiran.com", driver); }
		 */
   
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		openurl("http:\\www.javabykiran.com", driver);
	}
}	
		
		
		
		
	

