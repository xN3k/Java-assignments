import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum =0;

        for(int i =0; i<10; i++){
            System.out.println("Enter element " +(i+1 )+ ":");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Total sum is " + sum);

    }
}
