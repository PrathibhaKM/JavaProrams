package programs;

import org.testng.annotations.Test;

public class Frequency {
	@Test
	public void frequency()
	{
		String s1="Tester";
		String s=s1.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(i>j)
					{
						break;
					}
					else
						c++;
				}
			}
			
		
		if(c>1)
			System.out.println(s.charAt(i)+"-->"+c);
		}
}
}
