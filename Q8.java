interface DetailInfo{
    void display();int maxcount();
}
class Person1 implements DetailInfo{
    private String Name;int count;
    Person1(String s){
        this.Name=s;
    }
    @Override
    public void display() {
        System.out.println("The number of words in the name "+count);

    }

    @Override
    public int maxcount() {
        for(int i=0;i<Name.length();i++){
            if((Name.charAt(i))==' ' ){
               this.count++;
            }
            this.count++;
        }
        return this.count;

    }
}


public class Q8 {
    public static void main(String[] args) {
        Person1 p=new Person1("Soumik Dalei");
        p.display();

    }
}
