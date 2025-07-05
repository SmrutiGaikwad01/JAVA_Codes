class Parent{
    void Parent(){
        System.out.println("Parent class");
    }
}

class child extends Parent{
    void ParentChild(){
        System.out.println("Parent class but executed from child ");
    }
    void child(){
        System.out.println("Child class");
    }
}

public class Single{
    public static void main(String[]args){
        child c1=new child();
        c1.child();
        c1.ParentChild();
        c1.Parent();
    }
}