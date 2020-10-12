import java.io.FileOutputStream;
public class File
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		try{
		    FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
		    String S="how are you?";
		    byte b[]=s.getBytes();
		    fout.write(b);
		    fout.close();
		    System.out.println("success....");
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
