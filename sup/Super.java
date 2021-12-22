package sup;

public class Super {
    String a="10";
}
class B extends Super{
    String a="6";
    String show(String a){
        this.a=a;
        System.out.println(super.a);
        return super.a;
    }
    public static void main(String []args){
        B Data = new B();
        Data.show("25");
       // System.out.println(Data.a);
    }
}
