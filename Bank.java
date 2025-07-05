import java.util.Scanner;
class Bankdetails{
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public Bankdetails(String accountHolderName,int accountNumber, int balance ){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getaccountHolderName(){
        return accountHolderName;
    }

    public void setaccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

     public int getaccountNumber(){
        return accountNumber;
    }

    public void setaccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getbalance(){
        return balance;
    }

    public void setbalance(int balance){
        this.balance=balance;
    }

    public int deposit(int amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Rs "+amount+" Depoist successful");
        }
        else{
            System.out.println("Invalid Depoist");
        }
       return balance;
    }

    public int withdrawal(int amount){
        if(amount > 0 && amount<=balance){
            balance-=amount;
            System.out.println("Rs "+amount+" Withdrawal successful");
        }
        else{
            System.out.println("Invalid or Insufficient Balance");
        }
        return balance;
    }
}

public class Bank{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name of Account holder");
    String accName=sc.nextLine();
    System.out.println("Enter Account Number");
    int accNo=sc.nextInt();
    System.out.println("Enter Account Balance");
    int accbal=sc.nextInt();

    Bankdetails b=new Bankdetails(accName,accNo,accbal);
    System.out.println("Enter Amount for deposit: ");
    int dep=sc.nextInt();
    b.deposit(dep);
    System.out.println("Enter Amount for Withdrawal: ");
    int wd=sc.nextInt();
    b.withdrawal(wd);

    int CurrentBalance=b.getbalance();
     System.out.println("Current Balance is : " + CurrentBalance);

     String Status=(CurrentBalance >=5000)? "Minimum Balance is Maintained" : "Minimum Balance is not Maintained";
     System.out.println("Status : "+ Status);

   /* if(CurrentBalance >=5000){
        System.out.println("Status of bank is Maintained");
     }
     else{
         System.out.println("Status of bank is not Maintained");
    }
         */  
}}
