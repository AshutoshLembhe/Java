import java.util.ArrayList;
import java.util.Scanner;

public class Hall {
    private String name,ownerName,contactNumber;
    private double costPerDay;

    public Hall(String name, String contactNumber, double costPerDay ,String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }

}

public class Singlefile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String name,owner;
        String contact;
        double cost;
        ArrayList<Hall> ar = new ArrayList<>();
        for (int i=0;i<n;i++){
            name = scanner.nextLine();
            contact = scanner.nextLine();
            cost = scanner.nextDouble();
            owner = scanner.nextLine();
            ar.add(new Hall(name,contact,cost,owner));
        }

    }
}
