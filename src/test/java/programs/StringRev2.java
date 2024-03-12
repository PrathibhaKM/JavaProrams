package programs;

import org.testng.annotations.Test;

public class StringRev2 {
	@Test
	public void reverse()
	{
	String s="abcd";
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	}

}
