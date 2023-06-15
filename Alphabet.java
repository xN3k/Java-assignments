public class Alphabet {
    public static void main(String[] args) {
        char ch = 'A'; // You can change the value of ch to test different characters

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
