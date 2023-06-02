import java.util.Scanner;
class Distance{
    int m;double cm;
    Distance(){

    }
    Distance(int m,int cm ){
        if(cm>=100){
            m=cm/100;
            cm=cm%100;
        }
        this.m=m;
        this.cm=cm;
    }
    void display(){
        System.out.println(m+" meters "+cm+" centimeters");
    }
    public Distance sum(Distance x, Distance y){
      Distance d=new Distance();
      d.m=x.m+y.m;
      d.cm=x.cm+y.cm;
      return d;
    }
}
public class HW3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m and cm for part 1 ");
        int m=sc.nextInt();
        int cm=sc.nextInt();
        Distance d1=new Distance(m,cm);
        System.out.println("Enter m and cm for part 2 ");
        int m2=sc.nextInt();
        int cm2=sc.nextInt();
        Distance d2=new Distance(m2,cm2);
        Distance d3=new Distance();
        d3=d3.sum(d1,d2);
        d3.display();



    }
}
