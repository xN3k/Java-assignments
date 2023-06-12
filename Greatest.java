import java.util.Scanner;

public class Greatest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (A,B,C): ");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c ){
            System.out.println("A is greatest number");

        }else if(b > a && b>c){
            System.out.println("B is greatest number");
        }else if(c > a && c > b){
            System.out.println("C is greatest number");
        }else{
            System.out.println("Invalid");
        }
    }
}