import java.util.Scanner();

class BATSMAN{
    void quaility(){
        System.out.println("I am BATSMAN");
    }
}
class BOWLER extends BATSMAN{
    string name=NULL;
    BOWLER(String name){
        this.name=name;
        System.out.println("My name is "+this.name);
    }
    void qualitiy(){
        super.qualitiy();
        System.out.println("I am BOWLER too");
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BOWLER b=new BOWLER(scan.nextLine());
		b.quality();
	}
}
