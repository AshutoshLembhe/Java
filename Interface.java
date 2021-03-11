/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
interface Notification{
    void notificationBysms();
    void notificationByemail();
    void notificationBycourier();
}
class Icici implements Notification{
    public void notificationBysms()
    {
        System.out.println("ICICI - Notification by Sms");
    }
     public void notificationByemail()
    {
        System.out.println("ICICI - Notification by Email");
    }
     public void notificationBycourier()
    {
        System.out.println("ICICI - Notification by Courier");
    }
}
class Hdfc implements Notification{
    public void notificationBysms()
    {
        System.out.println("HDFC - Notification by Sms");
    }
     public void notificationByemail()
    {
        System.out.println("HDFC - Notification by Email");
    }
     public void notificationBycourier()
    {
        System.out.println("HDFC - Notification by Courier");
    }
    
}
public class Main
{
    
	public static void main(String args[]){
	    Notification n1=new Icici();
	    Notification n2=new Hdfc();
	    Scanner scan=new Scanner(System.in);
	    int no1,no2;
	    no1=scan.nextInt();
	    no2=scan.nextInt();
	    if(no1==1)
	    {
	        if(no2==1)
	        {
	            n1.notificationBysms();
	        }
	        else if(no2==2)
	        {
	            n1.notificationByemail();
	        }
	        else if(no2==3)
	        {
	            n1.notificationBycourier();
	        }
	    }
	    else if(no1==2)
	    {
	        if(no2==1)
	        {
	            n2.notificationBysms();
	        }
	        else if(no2==2)
	        {
	            n2.notificationByemail();
	        }
	        else if(no2==3)
	        {
	            n2.notificationBycourier();
	        }
	    }
	    else{
	        System.out.println("Invalid Input");
	    }
	}
}
