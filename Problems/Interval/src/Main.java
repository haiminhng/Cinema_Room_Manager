import java.util.Scanner;
class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // put your code here
        int a = input.nextInt();
        if (-15 < a && a <= 12)
        {
            System.out.println("True");
        }
        else if (a > 14 && a < 17) {
            System.out.println("True");
        }
        else if (19 <= a) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}