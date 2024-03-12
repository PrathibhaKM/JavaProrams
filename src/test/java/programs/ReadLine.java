package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {

	public static void main(String[] args) throws IOException {
		String filepath="C:\\Users\\hp\\Desktop\\token.txt";
		FileInputStream fis=new FileInputStream(filepath);
	File file=new File(filepath);
	int c=0;
	
	
		int result = fis.read();
		
		while(true)
		{
			if(result!=-1)
			{
				c++;
				
			}
			else
			{
				break;
			}
		}
		

System.out.println(c);		
		
	}

}
