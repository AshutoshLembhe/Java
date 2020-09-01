import java.util.Scanner;
public class DiamondPattern
{
	public static void main(String[] args) {
		System.out.println("diamond inscribed rectangle");
		Scanner scan=new Scanner(System.in);
		int i,j;
		System.out.println("Enter now of rows");
		int rows=scan.nextInt();
		/****upper part of diamond****/
		for(i=0;i<=rows;i++)
		{
		    for(j=1;j<=rows;j++)
		    {
		        System.out.print("*");
		    }
		    for(j=1;j<=(2*i-2);j++)
		    {
		        System.out.print(" ");
		    }
		    for(j=i;j<=rows;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("\n");
		}
		/***lower half of pattern***/
		for(i=0;i<=rows;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print("*");   
		    }
		    for(j=(2*i-2);j<(2*rows-2);j++)
		    {
		        System.out.print(" ");
		    }
		    for(j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("\n");
		}
	}
}