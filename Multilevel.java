class A{
     void a(){
        System.out.println("From A class");
    }
}

class B extends A{

    void b(){
        System.out.println("From B class");
    }
}

class C extends B{
    void c(){
        System.out.println("From C class");
    }
}
public class Multilevel{
    public static void main(String[]args){
        C c1=new C();
        c1.c();
        c1.b();
        c1.a();
    }
}