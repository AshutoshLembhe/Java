//  Conversion from StringBuffer and StringBuilder to String
public class Conversion{
public static void main(String[] args) {
StringBuffer sbr = new StringBuffer("After");
StringBuilder sbdr = new StringBuilder("Before");
// conversion from StringBuffer object to String
String str = sbr.toString();
System.out.println(str);
// conversion from StringBuilder object to String
String str1 = sbdr.toString();
System.out.println(str1);
// changing StringBuffer object sbr
// but String object(str) doesn't change
sbr.append(" the break");
System.out.println(sbr);
sbdr.append(" the break");
System.out.println(sbdr);
System.out.println(str);} }