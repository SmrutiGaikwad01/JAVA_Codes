import java.util.Scanner;
class armstrong{
    public static void PrintArmStrongNum(int start,int end){
        for(int num=start;num<=end;num++){
            int OgNum=num;
            int sum=0;
            int temp=num;
            while(temp>0){
                int digit=temp%10;
            int cube=1;
            for(int i =1;i<=3;i++){
                cube*= digit;
            }
            sum+=cube;
            temp/=10;
        }
        if (sum==OgNum){
            System.out.println(OgNum+" The number is Armstrong");
        }
    }
}
}

 class Armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        armstrong a=new armstrong();

        System.out.println("Enter the starting range of number:");
        int start=sc.nextInt();
        System.out.println("Enter the End range of number:");
        int end=sc.nextInt();
        System.out.println("The armstrong should in between "+start+" & "+end);
        a.PrintArmStrongNum(start,end);
    }
}