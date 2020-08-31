/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("hollow Rectangle");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pattern length");
		int no1=scan.nextInt();
		int no2=scan.nextInt();
    		for(int i=0;i<=no1;i++)
    		{
    		    for(int j=1;j<=no2;j++)
    		    {
    		        if(j==1 || j==no2 || i==1 || i==no1)
    		        {
    		            System.out.print("*");
    		        }
    		        else
    		        {
    		            System.out.print(" ");
    		        }
		        }
		        System.out.println();
		    }   
	    }
}
