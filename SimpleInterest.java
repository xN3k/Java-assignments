import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle, rate and time: ");
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = (principle * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
