/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		boolean isjavafun=true;
		boolean isfishtasty=false;
		System.out.println(isjavafun);
		// Type casting.
		int myInt=9;// int is of 4 byte size.
		double myDouble=myInt; // wide casting.
		// casting int to double 4 to 8 byte size.
		System.out.println(myInt);
		System.out.println(myDouble);
		double myD=9.78;
		int myI= (int)myD; // narrow casting double into int.
		System.out.println(myD);
		System.out.println(myI);
		// String operation.
		String txt = "ashutosh";
		System.out.println("lenght:"+txt.length());
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		// finding location.
		String txt1="please locate where 'locate' occurs";
		System.out.println(txt1.indexOf("locate"));
		// string concatenation.
		String last="lembhe";
		System.out.println(txt+" "+last);
		//using function.
		System.out.println(txt.concat(last));
	}
}
