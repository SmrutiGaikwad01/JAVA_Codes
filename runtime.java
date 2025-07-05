class Animal {
    void makeSound() {
        System.out.println("Animals");
    }
    void makeSounds() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat {
    static void prmint(Animal ref){
        ref.makeSound();
        ref.makeSounds();

    }
}

public class runtime {
    public static void main(String[] args) {
        // Animal a = new Animal();
         Dog d = new Dog();    
         d.makeSound();   
        
        Animal ref;
        ref=d;

        Cat.prmint(d);
    }
}

