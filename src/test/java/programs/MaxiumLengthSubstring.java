package programs;

public class MaxiumLengthSubstring {

	public static void main(String[] args) {
int n=5;
for(int row=n;row>=1;row--)
{
	for(int space=1;space<=row;space++)
	{
		System.out.print(" ");
		
	}
	for(int star=row;star<=n;star++)
	{
		System.out.print("* ");
	}
	System.out.println();
	}
	}
	
}

/*
        * 
      *   * 
    *   *   * 
  *   *   *   * 
*   *   *   *   * 

 */
