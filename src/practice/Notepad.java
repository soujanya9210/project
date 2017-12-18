package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Notepad {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan=new Scanner(new File("C:/Users/TYSS/Desktop/test.txt"));
		
		String key="having";
		
		int count=0;
		
		while(scan.hasNext())
		{
			if(scan.next().equalsIgnoreCase(key))
			{
				count++;
			}
	}
		System.out.println(key+" "+count);

}
}
