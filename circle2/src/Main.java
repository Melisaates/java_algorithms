import java.util.Scanner;
public class circle2 {
    double r;

    circle2(double r){
        this.r=r;
    }
    public double getArea(){
        return r*r*Math.PI;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("sayı gir");
        double r=s.nextDouble();
        circle2 c=new circle2(r);
        //double area=r*r*Math.PI;
        System.out.println("alan=%f"+c.getArea());
    }
}
