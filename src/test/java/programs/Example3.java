package programs;

import org.testng.annotations.Test;

public class Example3 {
@Test
public void example()
{
String s="hi how are you";
String[] s1 = s.split(" ");
for(int i=s1.length-1;i>=0;i--)
{
	System.out.print(s1[i]+" ");
}

}
@Test
public void example2()
{String s="o9#sol^ut#io$n&s";
String s1 = s.replace("[^0-9A-Za-z]","");
int c=s1.length()-1;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='0'&&s.charAt(i)<='9')
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
