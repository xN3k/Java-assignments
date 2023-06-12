import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1,4 ,6};
        int sum = 0;

        for (int i = 0; i<3; i++){
            sum += num[i];
        }

        System.out.println("Sum of 3 elements are: " + sum);
    }    
}
