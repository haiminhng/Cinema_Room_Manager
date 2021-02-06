import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int size = input.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers, 0, numbers.length);
        System.out.println(numbers[0]);
        }
    }
