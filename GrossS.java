import java.util.Scanner;
class Main{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int choice=1;
    while (choice==1){
        System.out.println("Enter Basic Salary: \n");
        int basic=sc.nextInt();
        
        int hra,da;
        if(basic>15000){
            hra=20*basic;
            da=60*basic;
        }
        else{
            hra=3000*basic;
            da=70*basic;
        }
        int grossSalary=basic+hra+da;
        System.out.println("gross salary is:"+grossSalary);
        
         System.out.println("enter -1 for calculate for another employee:\n");
        choice=sc.nextInt();        

    }
    System.out.println("exit program \n");
    }
}

