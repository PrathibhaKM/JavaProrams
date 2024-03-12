package programs;

import org.testng.annotations.Test;

public class Unique {
@Test
public void uniqueString()
{
	String s="Hi Hello Hi Hello Welcome";
	String[] s1 = s.split(" ");
	boolean b[]=new boolean[s1.length];
	for(int i=0;i<s1.length;i++)
	{
		if(b[i]==false) {
		int c=1;
		for(int j=i+1;j<s1.length;j++)
		{
		
			if(s1[i].equals(s1[j]))
		{
			c++;
			b[j]=true;
		}
	}
		if(c==1)
		System.out.println(s1[i]+"-->"+c);
		}
	}
}
}
