package programs;

import org.testng.annotations.Test;

public class Swap2 {
@Test
public void swap()
{
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
