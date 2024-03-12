package programs;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashMapStringOccurence {
@Test
public void occurence()
{
	String s1="Hi Hello Hi Hello Welcome";
	String s2=s1.toLowerCase();
	String[] s=s2.split(" ");
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	for(int i=0;i<s.length;i++) 
	{
		if(hm.containsKey(s[i]))
		{
			hm.put(s[i], hm.get(s[i])+1);
		}
		else
		{
			hm.put(s[i], 1);
		}
	}
	for(Entry<String,Integer>m:hm.entrySet())
	{
		System.out.println(m.getKey()+"-->"+m.getValue());
	}
}
@Test
public void occurence2()
{
	String s1="Hi Hello Hi Hello Welcome";
	String s2=s1.toLowerCase();
	String[] s=s2.split(" ");
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	for(int i=0;i<s.length;i++) 
	{
		if(hm.containsKey(s[i]))
		{
			hm.put(s[i], hm.get(s[i])+1);
		}
		else
		{
			hm.put(s[i], 1);
		}
	}
	for(Entry<String,Integer>m:hm.entrySet())
	{
		if(m.getValue()>1)
		System.out.println(m.getKey()+"-->"+m.getValue());
	}
}
@Test
public void occurence3()
{
	String s1="Hi Hello Hi Hello Welcome";
	String s2=s1.toLowerCase();
	String[] s=s2.split(" ");
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	for(int i=0;i<s.length;i++) 
	{
		if(hm.containsKey(s[i]))
		{
			hm.put(s[i], hm.get(s[i])+1);
		}
		else
		{
			hm.put(s[i], 1);
		}
	}
	for(Entry<String,Integer>m:hm.entrySet())
	{
		if(m.getValue()==1)
		System.out.println(m.getKey()+"-->"+m.getValue());
	}
}
}
