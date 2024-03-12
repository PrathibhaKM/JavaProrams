package programs;

import org.testng.annotations.Test;

public class Palindrome1 {
@Test
public void palindrome()
{
	String s="nayan";
	String temp="";
	for(int i=s.length()-1;i>=0;i--)
	{
		temp=temp+s.charAt(i);
	}
	if(temp.equals(s))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}

}
