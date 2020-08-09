/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Matrixip
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i,j,c,r;
		Scanner scan=new Scanner(System.in);
		int[][] matrix;
		System.out.println("Enter row and column");
		r=scan.nextInt();
		c=scan.nextInt();
		matrix=new int[r][c];
		System.out.println("Enter matrix value");
		for(i=0;i<r;i++)
		{
		    for(j=0;j<c;j++)
		    {
		        matrix[i][j]=scan.nextInt();
		    }
		}
		System.out.println("Matrix Output");
	    for(i=0;i<r;i++)
		{
		    for(j=0;j<c;j++)
		    {
		        System.out.print(" "+matrix[i][j]);
		    }
		    System.out.println();
		}
	}
}
