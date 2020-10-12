/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.FileOutputStream;
public class File1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		try{
		    FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
		    fout.write(65);
		    fout.close();
		    System.out.println("success....");
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
