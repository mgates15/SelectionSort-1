import java.io.*;
public class RandomNumberGenerator {
	public static void gen(){
		String pathname = "Doc7.txt";
		File file = new File(pathname);
		PrintWriter output = null;
		try{
			output = new PrintWriter(file);
		}
		catch (IOException ex)
		{
			System.out.println("*** Cannot create/open" + pathname + "***");
			System.exit(1);
		}
		for(int i = 0; i<251; i++){
		output.println((int)(Math.random()*100));
		}
		output.close();
	}
}
