package programs;

import org.testng.annotations.Test;

public class Reverse4 {
	@Test
	public void reverse()
	{
		String s="o9#sol^ut#io$n&s";
		String s1 = s.replace("[^0-9A-Za-z]", "");
		int c=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')
			{
				System.out.print(s1.charAt(c--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}

}
