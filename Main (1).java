/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello");
		String name="Ashutosh";
		String last=" Lembhe";
		System.out.println(name+last);
		int num=10,num1=20;
		int num3=num+num1;
		System.out.println(num3);
		byte mynum = 50; // cannot print number exceeding 127
		System.out.println(mynum);
		short mynum1=5000; // cannot print number exceeding 32767
		System.out.println(mynum1);
		float no=1.5f;
		// note float no. should end with f.
		System.out.println(no);
		double no1=19.9d;
		// note double no should end with d.
		System.out.println(no1);
	}
}
