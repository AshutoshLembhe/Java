/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.FileInputStream;
public class File2
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		try{
		    FileOutputStream fin=new FileOutputStream("D:\\testout.txt");
		    int i=fin.read();
		    System.out.print((char)i);
		    fin.close();
		    System.out.println("success....");
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
