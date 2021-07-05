package demoSele;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/MySoftware/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
  //driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
  		
	Select state = new Select(driver.findElement(By.xpath("//Select")));
	state.selectByVisibleText("Maharashtra");
	Thread.sleep(2000);
	state.selectByValue("Punjab");
	Thread.sleep(2000);
	//System.out.println("Print State by getOption()>> "+state.getOptions());
	
	List<WebElement> listOfState = state.getOptions();
	
	System.out.println("Name of all States::");
	for(WebElement textOfState: listOfState) {
		System.out.println(textOfState.getText());
	}
	}
}
