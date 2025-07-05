class Calculator{
    
    int add(int a,int b){
        System.out.println("Addition is :"+(a+b));
        return a+b;
    }

    int add(int x,int y,int z){
        System.out.println("Addition is :"+(x+y+z));
        return x+y+z;
    }

    double add (double p,double q){
        System.out.println("Addition of double is  :"+(p+q));
        return p+q;
    }
    public static void main(String[]args){
        Calculator c= new Calculator();
        c.add(3,5);
        c.add(1,2,3);
        c.add(2.22,2.22);
}
}