package annotations;

import org.testng.annotations.DataProvider;

public class DpLogin {
	
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