package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstAutomation 
{

	@Test
	public void fbloginFunctionality()
	{
		System.setProperty("webdriver.edge.driver", "./DriverSetup/msedgedriver.exe");
		
		//WebDriverManager.chromedriver().setup()
		WebDriver driver = new EdgeDriver();  //launch the edge browser
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
}
