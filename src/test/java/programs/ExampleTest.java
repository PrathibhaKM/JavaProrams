package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExampleTest {
	@Test
	public void openChromeTest()
	{
		WebDriver driver=new ChromeDriver();
		
		
	}
	@Test
	public void openFirefoxTest()
	{
		WebDriver driver1=new FirefoxDriver();
	}

}
