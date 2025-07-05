class Student{
    private String name;
    private int age;
    private String department;

    public Student(String name,int age,String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public int getage(){
        return age;
    }

    public void setage(int age){
        this.age=age;
    }

    public String getdepartment(){
        return department;
    }

    public void setdepartment(String department){
        this.department=department;
    }
  

}

public class Stud{
      public static void main(String[]args){
        Student s=new Student("Smruti",20,"Computer engg");
       /*  System.out.println("Name is:");
        System.out.println("Age is:");
        System.out.println("Department is:");*/
        
        s.setname("Smruti");
        s.setage(20);
        s.setdepartment("Computer engg");

        System.out.println("Name is:"+s.getname());
        System.out.println("Age is:"+s.getage());
        System.out.println("Department is:"+s.getdepartment());
    }
} 