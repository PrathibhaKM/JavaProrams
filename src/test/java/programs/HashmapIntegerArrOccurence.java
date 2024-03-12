package programs;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashmapIntegerArrOccurence {
	@Test
	public void occurence()
	{
		int[] a= {7,9,8,9,7,6,4};
		boolean[] b=new boolean[a.length];
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}
			else {		
			hm.put(a[i], 1);
			}
				
		}
		for(Entry<Integer,Integer>m:hm.entrySet())
		{
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
	}
	@Test
	public void occurence2()
	{
		int[] a= {7,9,8,9,7,6,4};
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}
			else {		
			hm.put(a[i], 1);
			}
				
		}
		for(Entry<Integer,Integer>m:hm.entrySet())
		{if(m.getValue()>1)
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
	}
@Test
	public void occurence3()
	{
		int[] a= {7,9,8,9,7,6,4};
		boolean[] b=new boolean[a.length];
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}
			else {		
			hm.put(a[i], 1);
			}
				
		}
		for(Entry<Integer,Integer>m:hm.entrySet())
		{
			if(m.getValue()==1)
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
	}

}
