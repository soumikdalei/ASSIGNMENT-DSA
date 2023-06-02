abstract class Shape{
    abstract void area();

}
class Circle extends Shape{
    private int r;private int area;
   Circle(int r){
       this.r=r;
   }
   @Override
    void  area() {
        area=(int)Math.PI*r*r;
        System.out.println(area);
    }

}
class Rectangle extends Shape{
    private int l;private int b;private double area;
   Rectangle(int l,int b){
       this.l=l;
       this.b=b;
   }
   @Override
    void  area() {
        area=0.5*l*b;
        System.out.println(area);
    }

}
class Square extends Shape{
    private int r;private int area;
   Square(int r){
       this.r=r;
   }
   @Override
    void  area() {
        area=r*r;
        System.out.println(area);
    }

}
public class Q6 {
    public static void main(String[] args) {
        Circle c= new Circle(3);
        Rectangle r=new Rectangle(3,5);
        Square s=new Square(4);
        c.area();
        r.area();
        s.area();

    }
}
