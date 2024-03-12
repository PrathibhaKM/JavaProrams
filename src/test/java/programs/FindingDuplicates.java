package programs;

import java.util.HashMap;

import org.testng.annotations.Test;

public class FindingDuplicates {
@Test
public void frequency2()
{
	String s1="Tester";
	String s=s1.toLowerCase();
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(hm.containsKey(s.charAt(i)))
		{
			hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
		}
		else
		{
			hm.put(s.charAt(i), 1);
		}
	}
	for(java.util.Map.Entry<Character, Integer> m:hm.entrySet()) {
		if(m.getValue()>1)
			System.out.println(m.getKey()+"-->"+m.getValue());
	}
	}

}
