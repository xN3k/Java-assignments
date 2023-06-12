import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit number:");
        int num = sc.nextInt();

        int reverse_no = 0;

        while(num > 0){
            int digit = num % 10;
            reverse_no = reverse_no * 10 + digit;
            num /= 10;
        }
        
        System.out.println(reverse_no);
    }
}