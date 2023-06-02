import java.util.Scanner;
class product{
    int pid;int price;public static int tot_price;
    product(){}
    product(int a,int b){
        this.pid=a;
        this.price=b;
    }
    public void display(){
        System.out.println("The product code is "+pid);
        System.out.println("The product price is "+price);
    }

}
public class Q4 {
    public static int add(int array[]){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int pid[]=new int[5];
        int price[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter product code ");
            pid[i]=sc.nextInt();
            System.out.println("Enter product price ");
            price[i]=sc.nextInt();
            product p=new product(pid[i],price[i]);
            p.display();
        }
        product p1=new product();
        p1.tot_price=add(price);
        System.out.println(p1.tot_price);


    }
}
