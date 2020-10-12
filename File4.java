/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.FileInputStream;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		try{
		    FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
		    int i=0;
		    while((i=fin.read()!=-1)
		    {
		        System.out.println((char)i);
		    }
		    fin.close();
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
