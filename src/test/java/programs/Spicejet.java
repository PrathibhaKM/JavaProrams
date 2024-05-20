package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Spicejet {
@Test
public void run() throws InterruptedException
{ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	WebElement from = driver.findElement(By.xpath("//div[text()='From']"));
	from.click();
	from.sendKeys("Ben");
	driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
	driver.findElement(By.xpath("//div[text()='To']")).sendKeys("De");
	driver.findElement(By.xpath("//div[text()='Delhi']")).click();
	WebElement departure = driver.findElement(By.xpath("//div[text()='Departure Date']"));
	departure.click();
	Thread.sleep(2000);
	departure.click();
	WebElement depdate = driver.findElement(By.xpath("//div[text()='April ']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[text()='1']"));
	depdate.click();
	driver.findElement(By.xpath("//div[text()='Return Date']")).click();
	driver.findElement(By.xpath("//div[text()='May ']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[text()='5']")).click();
driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();



}
}
