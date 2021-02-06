import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean result = true;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                ||    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
       ) {
             result = true;
            return result;
        }
         else if(true){
             result = false;
            return result;
        }
        return result;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }

}