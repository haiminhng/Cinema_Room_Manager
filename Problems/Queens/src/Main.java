import java.util.Scanner;
class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }
    }
}
