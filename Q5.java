import java.util.Scanner;
class Deposit{
    private long Principal;private int Time;private double Rate ;private double Tot_amt;
    Scanner sc=new Scanner(System.in);
    Deposit(){
        this.Principal=sc.nextLong();
        this.Time=sc.nextInt();
        this.Rate=sc.nextDouble();
    }
    Deposit(long a,int b,double c){
        this.Principal=a;
        this.Time=b;
        this.Rate=c;
    }
    Deposit(long a,int b) {
        this.Principal = a;
        this.Time = b;
        this.Rate = sc.nextDouble();
    }
    Deposit(long a,double c){
        this.Principal=a;
        this.Time=sc.nextInt();
        this.Rate=c;
    }
    public int calc_amt(){
        Tot_amt=Principal+((Principal*Rate*Time)/100);
        return calc_amt();
    }
    public void display(){
        System.out.println("Principal:-"+Principal);
        System.out.println("Rate:-"+Rate);
        System.out.println("Time:-"+Time);
    }



}
public class Q5 {
    public static void main(String[] args) {
        Deposit d1=new Deposit();
        Deposit d2=new Deposit(23,24,67.8);
        Deposit d3=new Deposit(23,34);
        Deposit d4=new Deposit(23,8.9);
        d1.display();
        d2.display();
        d3.display();
        d4.display();

    }
}
