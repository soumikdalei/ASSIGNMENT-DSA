import java.util.Scanner;
class Student1{
    private int roll_number;private String Name;private String course;
    public void input_Student(int a,String b,String c){
        this.roll_number=a;
        this.Name=b;
        this.course=c;
    }
    public void display_Student(){
        System.out.println("The roll Number is "+roll_number);
        System.out.println("The Name is "+Name);
        System.out.println("The Course is "+course);
    }
}
class Exam extends Student1{
    private int mark1;private int mark2;private int mark3;
    public void input_marks(int m1,int m2,int m3){
        this.mark1=m1;
        this.mark2=m2;
        this.mark3=m3;
    }
    public void display(){
        System.out.println("Marks 1 "+mark1);
        System.out.println("Marks 2 "+mark2);
        System.out.println("Marks 3 "+mark3);
    }

}
public class Q9 {
    public static void main(String[] args) {
        Exam e=new Exam();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your roll number ");
        int roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name ");
        String name=sc.nextLine();
        System.out.println("Enter your course ");
        String course=sc.nextLine();
        System.out.println("Enter marks 1 ");
        int m1=sc.nextInt();
        System.out.println("Enter marks 2 ");
        int m2= sc.nextInt();
        System.out.println("Enter marks 3 ");
        int m3= sc.nextInt();
        e.input_Student(roll,name,course);
        e.input_marks(m1,m2,m3);
        e.display_Student();
        e.display();
    }
}
