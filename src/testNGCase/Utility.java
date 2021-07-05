package testNGCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	public final static String URL=
			"file://C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/users.html";

public static ArrayList<String>getListofHeadingLabels(){
	WebDriver driver = Utility.browserSetup("chrome");
	System.out.println(1);
	Utility1.openurl(URL, driver);
	System.out.println(2);
	WebElement webElement = driver.findElement(By.xpath
			("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]"));
	System.out.println(3);
	System.out.println(webElement);
	List<WebElement> headingLableList = webElement.findElements(By.tagName("th"));
	System.out.println(4);
	System.out.println(headingLableList);
	System.out.println(headingLableList.size());
	ArrayList<String> actList = new ArrayList<>();
	
	for(WebElement headingLable:headingLableList){
		System.out.println("inside for loop");
		String headingText =headingLable.getText();
		actList.add(headingText);
		System.out.println(6);
		System.out.println("headingText>>"+ headingText);
		System.out.println(7);
		}
	System.out.println("actual List >>" +actList);
	return actList;
	}
public static ArrayList<String> fetchExpList(){
	ArrayList<String> expList = new ArrayList<String>();
	expList.add("#");
	expList.add("Username");
	expList.add("Email");
	expList.add("Phone");
	expList.add("Courses");
	expList.add("Gender");
	expList.add("State");
	expList.add("Action");
	System.out.println("expHeader List>>" +expList);
	return expList;
}
	/* Note: Read a property file
		 * ask for value of any key 
		 * example is "browser" 
		 * we will receive value as firefox  */
	
	public static WebDriver browserSetup(String brName){
		//FileInputStream fis = new FileInputStream("data.properties");
		//Properties properties = new Properties();
		//properties.load(fis);
		//String brName = properties.getProperty("brName");
		
		WebDriver driver = null;
		if(brName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(brName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("file://C:/MySoftware/Offline%20Website/Offline%20Website/index.html");
		//These changes are called as Configurational changes
		return driver;
 }
	public static void openurl(String url, WebDriver driver) {
		driver.get(url);
		}

	
	//public static void main(String[] args) throws IOException {  //it's for test functional testing
	//browserSetup();
	
}
