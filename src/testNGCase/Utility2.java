package testNGCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility2 {
	static public void openAnyUrl(String url, WebDriver driver) {
		 driver.get(url);
	}
	
	public static String getLabel(String locName, String locvalue, WebDriver driver) {
	String heading = "";
	if(locName.equals("xpath")) {
		heading = driver.findElement(By.xpath(locvalue)).getText();
	}
	if(locName.equals("id")) {
		heading = driver.findElement(By.id(locvalue)).getText();
	}
	openAnyUrl("http:\\www.javabykiran.com", driver);
	return heading;
	}
	
	 }


