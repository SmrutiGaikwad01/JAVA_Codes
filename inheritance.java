import java.util.Scanner;
class Animal{
    void sound(){
        System.out.println("From Animal class");
    }
}

class Dog extends Animal{
    void soundD(){
        System.out.println("From Dog class");
    }
}

class Cat extends Dog{
    void soundC(){
        System.out.println("From Cat class");
    }
}

class inheritance{
    public static void main(String[]args){
        Cat c=new Cat();
        c.soundC();
        c.soundD();
        c.sound();
    }
}