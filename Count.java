import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number;
        int Evencount=0;
        int Oddcount=0;

       System.out.println("Enter the number (to stop use -1): \n");
       
       while(true){
        number=sc.nextInt();
        if(number==-1){
            break;
        }
        if(number%2==0)
        {
            Evencount++;
        }
        else{
            Oddcount++;
        }
       }
        System.out.println("\nTotal Even Numbers: " +Evencount );
        System.out.println("Total Odd Numbers: " +Oddcount );
    }
}