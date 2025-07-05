public class Employee {
    protected int Age ;
    protected int Id;
    protected String Name;
    protected boolean ispermanent;

    public static void main(String[]args){
        Employee emp = new Employee();

     //  emp.Age=35.5; error: incompatible types: possible lossy conversion from double to int
         emp.Age=(int) 35.5;

        System.out.println("Successfully Started");
    }
}