package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Yatra {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
		
driver.manage().window().maximize();
driver.get("https://www.yatra.com/");
driver.findElement(By.xpath("//label[@for='BE_flight_origin_city']")).click();

	}

}
