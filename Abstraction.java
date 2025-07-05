abstract class Animal{
    Animal(){
        System.out.println("Constructor of animal");
    }
    abstract void sound();   
}

class dog extends Animal{
    dog(){
        System.out.println("Constructor of dog");
    }

    public void sound(){
        System.out.println("method of abstract class !");
    }
}

public class Abstraction{
    public static void main(String[]args){
        dog d=new dog();
        d.sound();
    }
}