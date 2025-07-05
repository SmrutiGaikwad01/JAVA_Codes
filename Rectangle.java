class rect{
    int length;
    int width;

    rect(int length,int width){
        this.length=length;
        this.width=width;
    }

    int calculateArea(){
      return length*width;
    }
}

public class Rectangle{
    public static void main(String[]args){
        rect r=new rect(10,10);
        rect r1=new rect(20,20);
        System.out.println("Area of rectangle 1:"+r.calculateArea());
        System.out.println("Area of rectangle 2:"+r1.calculateArea());
        int area1=r.calculateArea();
        int area2=r1.calculateArea();
        if(area1>area2){
            System.out.println("Rectangle1 > Rectangle2");
        }
        else if (area2 >area1){
            System.out.println("Rectangle1 < Rectangle2");
        }
        else{
            System.out.println("They are equal");
        }
    }
}