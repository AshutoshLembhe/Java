/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Left sided pyramid Pattern");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pattern length");
		int no=scan.nextInt();
		for(int i=0;i<no;i++)
		{
		    int stars=i+1;
		    for(int j=no;j>stars;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.print("\n");
		}
	}
}
