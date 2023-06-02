import java.util.Scanner;
class phone{
    int area_code;int exchange;int number;
    public void input(int area_code, int exchange, int number){
        this.area_code=area_code;
        this.exchange=exchange;
        this.number=number;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        area_code=sc.nextInt();
        exchange=sc.nextInt();
        number=sc.nextInt();
    }
    public void display(){
        System.out.println("My number is "+"("+area_code+")"+"  "+exchange+"-"+number);
    }
    public void display1(){
        System.out.println("Your number is "+"("+area_code+")"+"  "+exchange+"-"+number);
    }

}
public class Q1 {
    public static void main(String[] args) {
        phone p=new phone();
        p.input(212,767,8900);
        p.display();
        phone a=new phone();
       a.input();
       a.display1();


    }
}
