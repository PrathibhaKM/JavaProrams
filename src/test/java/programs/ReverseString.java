package programs;

import org.testng.annotations.Test;

public class ReverseString {
@Test
public void reverse()
{
	String s="abcdef";
 char[] ch=s.toCharArray();

 for(int i=ch.length-1;i>=0;i--)
 {
System.out.println(ch[i]);
	  
	 
	 
 }
 
}
}
