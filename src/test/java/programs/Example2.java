package programs;

import org.testng.annotations.Test;

public class Example2 {
@Test
public void occurence()
{
	String s="aababbc";
char[] ch = s.toCharArray();

for(int i=0;i<ch.length-1;i++)
{

	if(ch[i]==ch[i+1])
	{
	
	System.out.println(ch[i]+""+ch[i+1]);
	i=i+1;
	}
	else {
		System.out.println(ch[i]);
	}
	
	}

System.out.println(ch[ch.length-1]);
}
}
