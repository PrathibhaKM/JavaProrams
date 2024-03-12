package programs;

public class MainDemo implements Demo{

	
	public void fruit()
	{
		System.out.println("mango and gauva");
	}
	public void sing()
	{
		System.out.println("singing");
	}
	public static void main(String[] args) {
	
		MainDemo m=new MainDemo();
		m.fruit();
		m.sing();
		System.out.println(m.i);
	}
}

