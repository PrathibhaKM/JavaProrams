package programs;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccurenceOfEachCharacter1 {
	@Test
	public void occurence()
	{
		String s="aabcabd";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> m1:hm.entrySet()) {
			System.out.print(m1.getKey()+""+m1.getValue());
		}
		
	}

}
