import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        int i;

        for(i = 0; i<n; i++){
            System.out.println("Enter element " + (i+1) + ":");
            num[i] = sc.nextInt();
        }

        System.out.println("\nElements exactly divisible by 3: ");
        for(i = 0; i<n; i++){
            if(num[i] % 3 == 0){
                System.out.println(num[i]);
            }
        }
        

    }
}
