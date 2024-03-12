package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KayakTest {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.kayak.co.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//*[name()='svg' and @class='vvTc-item-icon']")).click();
driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("Bengaluru");
// driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("Pune");
 driver.findElement(By.xpath("//span[text()='Bengaluru, Karnataka, India']")).click();

WebElement text = driver.findElement(By.xpath("//input[@placeholder='To?']"));
text.click();
text.sendKeys("New Delhi");

 driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']")).click();
 driver.findElement(By.xpath("//*[name()='svg' and @class='c8LPF-icon']")).click(); 
 //driver.quit();

	}

}
