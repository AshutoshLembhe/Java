public class Loops
{
	public static void main(String[] args) {
	
	    int i=0;
	    do{
	        System.out.println("Hello World");
	        i++;
	    }while(i<5);
	    
	    for(int x=0;x<5;x++)
	    {
	        System.out.println("Hello World");
	    }
	    
	    String[] cars={"volvo","Maruti","ford","Mazda"};
	    for(String y:cars){// here y will be initialized by default zero.
	        System.out.println(y);
	    }
	}
}
