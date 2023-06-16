public class FivePatternRev {
    public static void main(String[] args){
        for(int i =1; i<=5; i++){
            for(int j =5; j>i; j--){
                System.out.print(" ");
    
            }
            for(int k= 5; k>=6-i; k--){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
