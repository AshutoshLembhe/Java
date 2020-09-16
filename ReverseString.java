import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str=scan.nextLine();
        StringBuilder sb=new StringBuilder(str);
        int str_len=sb.length();
        // Direct reverse_string
        reverse_string(sb,0,str_len-1);
        // Word by word reverse
        int start_idx=0;
        for(int idx=0;idx<str_len;idx++)
        {
            if(sb.charAt(idx)==' ')
            {
                reverse_string(sb,start_idx,idx-1);
                start_idx=idx+1;
            }
            else if(idx==(str_len-1))
            {
                reverse_string(sb,start_idx,idx);
                {
                    start_idx=idx+1;
                }
            }
            
        }
        System.out.println(sb);
    }
    // Function to reverse the string
    public static void reverse_string(StringBuilder sb,int start_idx,int end_idx)
    {
        int end=end_idx;
        int front=start_idx;
        while(front<end)
        {
            char tmp_ch=sb.charAt(front);
            sb.setCharAt(front,sb.charAt(end));
            sb.setCharAt(end,tmp_ch);
            front++;
            end--;
        }
    }
}