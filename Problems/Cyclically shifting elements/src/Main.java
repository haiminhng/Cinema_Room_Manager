import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] number = new int[n];
        for(int i = 1 ; i < number.length ; i++){
            number[i] = input.nextInt();
        }
        number[0] = input.nextInt();
        for (int element: number) {
            System.out.print(element +" ");
        }
    }
}