import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] number = new int[n];
        int countmax = 0;
        int countcurrently = 0;
        int countfinal = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
            for (int j = 1; j < number.length; j++) {
                if (number[j] > number[i]) {
                    countcurrently++;
                } else {
                    countmax = Math.max(countcurrently, countmax);
                    countcurrently = 0;
                }

            }
        }
        System.out.println(countmax);
    }
}

