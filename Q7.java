import java.util.Scanner;
class Person{
    protected String name;protected int age;
    Person(String n,int a){
        this.name=n;
        this.age=a;
    }
}
class Employee extends Person{
    private int eid;private double salary;

    Employee(String n, int a,int b,double d) {
        super(n, a);
        this.eid=b;
        this.salary=d;
    }
    public void empDisplay(){
        System.out.println("Name of the employee "+name);
        System.out.println("Age of the employee "+age);
        System.out.println("Employee ID of the employee "+eid);
        System.out.println("Salary of the employee "+salary);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee's name ");
        String name=sc.nextLine();
        System.out.println("Enter age of the employee ");
        int age =sc.nextInt();
        System.out.println("Enter Employee Id ");
        int eid=sc.nextInt();
        System.out.println("Enter Salary ");
        double salary=sc.nextDouble();
        Employee e=new Employee(name,age,eid,salary);
        e.empDisplay();

    }
}
