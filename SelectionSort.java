import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args){
		
	}
public static void ray(int num[]){
int i,min,temp;
// This finds the index of maximum value
for(i = 0;i<num.length-1;i++){
	min = i;
for(int k = num.length-1; k>=i ; k--){
	if(num[min] < num[k]){
		
	}
	else{
		temp = num[min];
		num[min] = num[k];
		num[k] = temp;
	}
}
		System.out.println(Arrays.toString(num));
	}
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
{
output.println(Arrays.toString(num));
}
output.close();
}
}
