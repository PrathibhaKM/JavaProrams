package programs;

import org.testng.annotations.Test;

import Generic.BaseClass;

public class MyProject extends BaseClass{
	@Test
	public void m1()
	{
		driver.get("https://www.facebook.com/");
	}

}
