public class Student
{
     int id;
     String name;
     void insertRecord(int r,String n)
     {
         id=r;
         name=n;
     }
     void displayInformation()
     {
        System.out.println("Id of student:"+id);
        System.out.println("Name of student:"+name);
     }
}
class Main{
    public static void main(String[] args){
        Student s1= new Student();
        Student s2= new Student();
        s1.insertRecord(1025,"Ashutosh");
        s2.insertRecord(1082,"Mayank");
        s1.displayInformation();
        s2.displayInformation();
    }
    
}