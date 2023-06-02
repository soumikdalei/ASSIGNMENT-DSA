import java.util.Scanner;
class Book{
    private String BName;private int BEdition;private int BPrice;
    Book(String name,int n,int p){
        this.BName=name;
        this.BEdition=n;
        this.BPrice=p;
    }
    public void display(){
        System.out.println("The Book Name is "+BName);
        System.out.println("The Book Edition is "+BEdition);
        System.out.println("The Book Price is "+BPrice);
    }
}
public class HW2 {

    public static int compare(int[] array){
        int max=array[0];int i;
        for( i=0;i<array.length;i++){
            if (array[i]>max) {
                max=array[i];

            }

        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price []=new int[5];
        String BookName []=new String[5];
        int Bookedition []=new int[5];

        for (int i=0;i<5;i++){
            System.out.println("Enter Price ");
            price[i]= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Book name ");
            BookName[i]= sc.nextLine();
            System.out.println("Enter book edition ");
            Bookedition[i]= sc.nextInt();
        }
        int j=0;
        for (int i=0;i<5;i++){
        if(compare(price)==price[i]){;
        j=i;}
        }
        Book b=new Book(BookName[j],Bookedition[j],price[j]);
        b.display();

       

    }
}
