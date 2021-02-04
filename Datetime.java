import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Datetime
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		LocalDateTime mydateobj = LocalDateTime.now();
		System.out.println("before formatting: "+ mydateobj);
		DateTimeFormatter myFormatobj= DateTimeFormatter.ofPattern("G,E,dd-mm-yyyy HH:mm:ss");
		String formattedDate = mydateobj.format(myFormatobj);
		System.out.println("after formatting: "+ formattedDate);
	}
}