import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        /* write your code here
        Check for repeated elements: columns, rows, small squares: added elements to hashset and then compared the size of hashset with the size of column, row, or small square.
        Check that no elements of sudoku more than given n.
        Check for:
        1) All elements of board are in range 1..N^2
        2) Every row contains full range of numbers 1..N^2
        3) Every column contains full range of numbers 1..N^2
        4) Check the edge cases of N=1 and N=10
        4) Every board is sub-divided in to a virtual array of N, NxN tiles such that:
        - Every NxN tile contains full range of numbers 1..N^2
         */
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        int arr[][] = new int[N][N];
        for (int[] _random : arr) Arrays.fill(arr, (int)((Math.random()) * N + 1));
        System.out.println(arr[1][1]);
    }
}