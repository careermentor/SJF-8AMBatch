package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation 
{

	@Test
	public void fbloginFunctionality()
	{
		WebDriverManager.chromedriver().setup()
		WebDriver driver = new ChromeDriver();  //launch the chrome browser
	}
	
}
