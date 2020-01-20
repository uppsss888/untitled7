package collect;

public class B {
    int x=5;
    B temp=this;
    void f (){
        B b1=new B();
        b1.x=10;
        temp=b1;
    }
}
class B1{
    public static void main(String[] args) {
        B b=new B();
        b.f();
        System.out.println(b.x);
    }
}
