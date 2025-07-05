interface  Animal{
    void show();
}

interface Dog {
    void showD();
}

class Duck implements Animal,Dog{
    public void show(){
        System.out.println("animal class ");
    }
    public void showD(){
        System.out.println("Dog class ");
    }
    public void showDuck(){
        System.out.println("Duck class ");
    }
}

class multipleInheritance{
    public static void main(String[]args){
        Duck d=new Duck();
        d.show();
        d.showD();
        d.showDuck();
    }
}