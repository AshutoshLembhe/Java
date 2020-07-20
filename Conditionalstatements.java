/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Conditionalstatements
{
	public static void main(String[] args) {
		
		/******IF-ELSE********/
		int x=18;
		int y=100;
		if(x>y){
		    System.out.println("x is greater than y");
		}
		else{
		    System.out.println("y is greater than x");
		}
		// Ternary operator.
		String result=(x>y)?"x is greater than y":"y is greater than x";
		System.out.println(result);
		/*******SWITCH CASES******/
		int a=0; // change value from 1 to 3 to activate each case.
		switch(a){
		    case 1:
		        System.out.println("Switch case 1");
		        break;
		    case 2:
		        System.out.println("switch case 2");
		        break;
		    case 3:
		        System.out.println("switch case 3");
		        break;
		    default:
		        System.out.println("when a = other than 1 to 3");
		}
	}
}
