// Compile time 
class add {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

class polymorphism{
    public static void main(String[]args){
        add a=new add();
        a.add(5,2);
        a.add(3,2,1);
    }
}

