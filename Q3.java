import java.util.Scanner;
class Student{
    private int roll;private String name;private int DSA_marks;
    public void getData(int a, String s,int b){
        this.roll=a;
        this.name=s;
        this.DSA_marks=b;
    }
    public void display(){
        System.out.println("The roll no is "+roll);
        System.out.println("The name is "+name);
        System.out.println("The marks are "+DSA_marks);
    }
}
public class Q3 {
    public static void max(int array[],String s[],int array2[]){
        Student a=new Student();
        int max=array2[0];int max2=array[0];String d=" ";
        for(int i=0;i<array2.length;i++){
            if(array2[i]>max){
                max=array2[i];
                max2=array[i];
                d=s[i];
            }
        }
        a.getData(max2,d,max);
        a.display();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int roll[]=new int[num];
        String name[]=new String[num];
        int marks[]=new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter roll no ");
            roll[i]=sc.nextInt();
            System.out.println("Enter name ");
            sc.hasNextLine();
            name[i]=sc.nextLine();
            System.out.println("Enter marks ");
            marks[i]=sc.nextInt();
        }
        max(roll,name,marks);
    }
}
