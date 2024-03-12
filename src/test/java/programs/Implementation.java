package programs;

public class Implementation extends EXampleForAbstraction{

	public void run()
	{
		System.out.println("running");
		
	}
	public void walk()
	{
		System.out.println("walking2");
	}
	public void jump()
	{
	System.out.println("jumping");	
	}
	public static void main(String[] args) {
Implementation i=new Implementation();
i.run();
i.walk();
i.jump();
	}

}
