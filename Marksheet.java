import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects(Java, DSA, SAD, Web, Stats): ");
        double java = sc.nextDouble();
        double dsa = sc.nextDouble();
        double sad = sc.nextDouble();
        double web = sc.nextDouble();
        double stats = sc.nextDouble();
        
        double percent = (java + dsa + sad + web + stats) / 500 * 100;
        
        System.out.println("Total percentage = " + percent +"%");

        if(java <30 || dsa < 30 || sad <30 || web<30 || stats <30){
            System.out.println("Failed");
        }else{
            if(percent >= 80){
                System.out.println("Distinction");
            }else if(percent <80 && percent >=70){
                System.out.println("First division");
            }else if(percent < 70 && percent >= 60){
                System.out.println("Second Division");
            }else if(percent < 60 && percent >=50 ){
                System.out.println("Third division");
            }else{
                System.out.println("Passed");
            }
        }
    }
}
