import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int busHeight;
        int bridgesCount;
        int j = 0;
        int bridgeHeight;

        busHeight = input.nextInt();
        bridgesCount = input.nextInt();
        for( int i = 0; i < bridgesCount; i++) {
            bridgeHeight = input.nextInt();
            j = i + 1;
            if (bridgeHeight <= busHeight) {
                System.out.print("Will crash on bridge " + j);
                break;
            } else if (j == bridgesCount){
                System.out.println("Will not crash\n");
            }
        }
    }
}

