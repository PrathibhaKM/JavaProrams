package programs;

import org.testng.annotations.Test;

public class StringRev3 {
	@Test
	public void reverse()
	{
		String s="Aftab";
		StringBuffer b=new StringBuffer(s);
		System.out.println(b.reverse());
		
	}
}
