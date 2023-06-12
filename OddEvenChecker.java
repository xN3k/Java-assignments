import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if( num  % 2 == 0){
            System.out.println(num + " is Even number");
        }else if(num % 2 !=0){
            System.out.println(num + "is odd number");
        }else{
            System.out.println(num + " invalid number");
        }
    }
}
