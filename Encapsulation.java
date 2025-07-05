class student{
    private String Name;
    private int Marks;
 public String getName(){
        return Name;
    }
    public int getMarks(){
        return Marks;
    }
    public void setName(String NewName){
        Name=NewName;
    }
    public void setMarks(int NewMarks){
        this.Marks=NewMarks;
    }

    
   
}

class Encapsulation{
    public static void main(String[]args){
        student s1=new student();

        s1.setName("Smruti");
        s1.setMarks(20);
        System.out.println("Name is "+s1.getName());
        System.out.println("Marks is "+s1.getMarks());

    }
}