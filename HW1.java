import java.util.Scanner;

class Commission{
    private int sales;private double c;
    Commission(int s){
        this.sales=s;
    }
    public double getCommission(){
        if(sales<100){
            c=0.02*sales;}
        else if(sales>=500&&sales<5000){
            c=(0.02*500)+(0.05*(sales-500));}
        else if(sales>=5000){
            c=0.02*500+0.05*4500+0.08*(sales-5000);}
        return c;
    }
}
public class HW1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sales ");
        int sales=sc.nextInt();
        if(sales<0){
            System.out.println("Invalid input ");
        }
        Commission c=new Commission(sales);
        System.out.println("The commission is "+c.getCommission());

    }
}
