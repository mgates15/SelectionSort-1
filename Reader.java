import java.io.*;
import java.util.*;
public class Reader {
	public static int[] read(){
		String pathname = "Doc7.txt";
		File file = new File(pathname);
		Scanner input = null;
		try
		{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
		System.out.println();
		}
		int[] num = new int[250];
		
		for(int i = 0; i<250; i++){
		num[i] = input.nextInt();
			}
		
		return num;}
}
