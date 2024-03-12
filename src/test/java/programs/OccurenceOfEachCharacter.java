package programs;

import org.testng.annotations.Test;

public class OccurenceOfEachCharacter {
	@Test
	public void frequency()
	{
		String s="abceabcc";
		boolean b[]=new boolean[s.length()];
	char[] ch=s.toCharArray();	
	for(int i=0;i<ch.length;i++)
	{
		if(b[i]==false)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					b[j]=true;
					
				}
			}
		
		System.out.println(ch[i]+"-->"+c);
		}
		}
	}

}
