import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and base: ");
        double height = sc.nextDouble();
        double base = sc.nextDouble();
        
        double area = (base * height)/2;
        
        System.out.println("Area of triangle = " + area);
    }   
}
