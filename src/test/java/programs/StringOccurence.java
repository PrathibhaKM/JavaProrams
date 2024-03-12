package programs;

import org.testng.annotations.Test;

public class StringOccurence {
@Test
public void occurence()
{
	String s="Tester";
	s=s.toLowerCase();
	char[] ch = s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		int c=0;
		for(int j=0;j<ch.length;j++) 
		{
			
		if(ch[i]==ch[j])
		{
			if(i>j)
			{
				break;
			}
			else
			{
				c++;
			}
			
		}
		}
		if(c>=1) {
		System.out.println(ch[i]+"-->"+c);}
	}
}
}
