import java.util.Scanner;
class Complex{
    double re;double le;
    void setData(double r,double l){
        this.re=r;
        this.le=l;
    }
    void display(){
        System.out.println("("+this.re+","+this.le+")");
    }
    public Complex add(Complex x, Complex y){
        Complex z=new Complex();
        z.re=x.re+y.re;
        z.le=x.le+y.le;
        return z;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex obj1=new Complex();
        System.out.println("Enter real and image of part 1 of complex number ");
        int r=sc.nextInt();
        int i=sc.nextInt();
        obj1.setData(r,i);
        obj1.display();
        Complex obj2=new Complex();
        System.out.println("Enter real and image of part 1 of complex number ");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        obj2.setData(r1,i1);
        obj2.display();
        Complex obj3=new Complex();
        obj3=obj3.add(obj1,obj2);
        obj3.display();

    }
}
