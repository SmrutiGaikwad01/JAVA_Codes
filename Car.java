import java.util.Scanner;
class Car{
    String Make;
    String Model;
    short  Year;
    int Price;

    Car(String make,String model,short year,int price){
        this.Make=make;
        this.Model=model;
        this.Year=year;
        this.Price=price;
    }

    void display(){
        System.out.println("---------------");
        System.out.println("Car Info");
        System.out.println("Make:"+Make);
        System.out.println("Model:"+Model);
        System.out.println("Year:"+Year);
        System.out.println("Price:"+Price);
        System.out.println("---------------");
    }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Make:");
            String Make=sc.nextLine();
            System.out.println("Model:");
            String Model=sc.nextLine();
            System.out.println("Year:");
            short Year=sc.nextShort();
            System.out.println("Price:");
            int Price=sc.nextInt();

            Car c=new Car(Make,Model,Year,Price);
            c.display();
        }
    }