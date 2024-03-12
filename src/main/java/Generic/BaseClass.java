package Generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.devtools.v113.browser.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
public RemoteWebDriver driver;
@Parameters("Browser")
@BeforeClass
public void launchBrowser(String Browser) throws MalformedURLException
{
	URL url=new URL("http://192.168.25.213:4444/wd/hub");
	DesiredCapabilities d=new DesiredCapabilities();
	if(Browser.equalsIgnoreCase("chrome"))
	{
		d.setBrowserName("chrome");
        d.setPlatform(Platform.WINDOWS);
	}
	else if(Browser.equals("firefox"))
	{
		d.setBrowserName("firefox");
		d.setPlatform(Platform.WIN10);
	}
	driver=new RemoteWebDriver(url,d);
}

}
