class single{
    private static single instance;

    private single(){
        //
    }
    public static single getInstance(){
        if(instance ==null){
            instance =new single();
        }
    }
}

public class singleton{
    public static void main(String[]args){
        single s =single.getInstance();
    System.out.println(s.hashCode());
    single s1 =single.getInstance();
    System.out.println(s1.hashCode());
    } 
}