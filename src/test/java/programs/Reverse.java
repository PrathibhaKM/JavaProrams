package programs;

import org.testng.annotations.Test;

public class Reverse {
	@Test
	public void reverse()
	{
		String s="Hi! He!llo Welc!ome !To ";
		String[] s1 = s.split(" ");
		String s2=s.replace("[^A-Za-z' ']", "");
		
		String res=" ";
		for(int i=0;i<s1.length;i++) {
			char[] c = s1[i].toCharArray();
			String rev=" ";
			for(int j=c.length-1;j>=0;j--) {
				rev=rev+c[j];
			}
			res=res+rev+" ";
			
		}
		System.out.println(res);
	}

}
