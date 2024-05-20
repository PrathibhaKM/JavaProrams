package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow {

	public static void main(String[] args) {
String s="hi hello welcome welcome";
String[] s1 = s.split(" ");
int max=s1[0].length();
for(int i=0;i<s1.length;i++)
{
	
	
	if(max<s1[i].length())
	{
		max=s1[i].length();
	}
	
}
	for(int i=0;i<s1.length;i++)
	{
		if(s1[i].length()==(max)) {
			System.out.println(s1[i]);
		}
	}
	}

}
